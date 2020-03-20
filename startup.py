import json
import subprocess
from subprocess import DEVNULL


class Constants:
    STARTUP_FILE = 'startup-config.json'


class Deploy:

    def main(self):
        print('Startup deployment')
        with open(Constants.STARTUP_FILE, 'r') as f:
            startup = json.load(f)

        for instance in startup:
            module = instance['module']
            name = instance['name'].lower()
            directory = instance['directory']
            port_outside = str(instance['port-out'])
            port_inside = str(instance['port-in'])

            print('Starting module: "' + module + '" from directory: "' + directory + '" as container: "' + name + '" on port: "' + port_outside + '"')

            maven_args = ""
            if 'maven-arguments' in instance:
                maven_args_obj = instance['maven-arguments']
                for i in maven_args_obj:
                    maven_args += " -D" + i['key'] + "=" + str(i['value'])
            self.build_module(module, directory, maven_args)
            self.stop_docker_container(name)

            parameter = ""
            if 'parameter' in instance:
                parameter_obj = instance['parameter']
                for i in parameter_obj:
                    parameter += " --" + i['key'] + "=" + str(i['value'])
            self.start_docker_container(name, module, directory, port_outside, port_inside, parameter)
            print('Started module: "' + module + '" from directory: "' + directory + '" as container: "' + name + '" on port: "' + port_outside + '"')

    def stop_docker_container(self, name):
        print('Stopping docker container: "' + name + '"')
        self.execute_command_global("docker stop " + name)
        print('Removing docker container: "' + name + '"')
        self.execute_command_global("docker rm " + name)

    def start_docker_container(self, name, module, directory, port_outside, port_inside, parameter):
        print('Building docker image: "intrao/' + module.lower() + '" of module: "' + module + '" from directory: "' + directory + '"')
        self.execute_command_directory("docker build -t intrao/" + module.lower() + " .", directory)
        print('Starting docker container with name: "' + name + '" from image: "intrao/' + module.lower() + '" on port: "' + port_outside + '" with parameter: "' + parameter + '"')
        self.execute_command_global("docker run -p " + port_outside + ":" + port_inside + " -d --name " + name + " intrao/" + module.lower() + parameter)

    def build_module(self, module, directory, maven_args):
        print('Building module: "' + module + '" form directory: "' + directory + '" with arguments: "' + maven_args + '"')
        self.execute_command_directory("mvn clean install" + maven_args, directory)

    @staticmethod
    def execute_command_directory(command, directory):
        subprocess.run(command, cwd=directory, stdin=DEVNULL, shell=True)

    @staticmethod
    def execute_command_global(command):
        subprocess.run(command, stdin=DEVNULL, shell=True)


if __name__ == '__main__':
    deploy = Deploy()
    deploy.main()
