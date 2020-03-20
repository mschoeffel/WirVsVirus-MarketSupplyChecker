## Setup MySql Docker Container
```bash
docker pull mysql/mysql-server:latest
```
```bash
docker run --name=mysql --restart=unless-stopped -p 3306:3306 -d mysql/mysql-server:latest
```
```bash
docker logs mysql
```
Check for Password like `GENERATED ROOT PASSWORD: Axegh3kAJyDLaRuBemecis&EShOs`
```bash
docker exec -it mysql mysql -uroot -p
```
Enter password
```sql
ALTER USER 'root'@'localhost' IDENTIFIED BY 'toor';
CREATE USER 'admin' IDENTIFIED BY 'admin';
GRANT ALL PRIVILEGES ON *.* TO 'admin';
CREATE SCHEMA SWSC;
```