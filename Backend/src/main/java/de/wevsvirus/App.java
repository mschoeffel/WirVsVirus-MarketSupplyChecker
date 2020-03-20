package de.wevsvirus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    @Value( "${spring.custom.my.test}" )
    private String test;

    @Value( "${spring.custom.my.testtwo}" )
    private String test2;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
