# Wir Vs Virus Hackathon
<p align="center">
<img src="https://github.com/mschoeffel/WirVsVirus-MarketSupplyChecker/blob/master/assets/WVVLogo.png?raw=true" alt="WirVsVirusLogo" \>
</p>

Wir Vs Virus was a hackathon taking place from 20th of march till 23rd of march, organized by german government in cooperation with organizations and companies like "CODE for germany", "Iniative D21", "project together" and many more.\
The goal was to find solutions to any problems COVID-19 is causing.\
The problems could be submitted in advance and at the start of the hackathon more than 42 thousand participants could build smaller teams to solve a problem and submit their solution till sunday evening.\
You can find further information on the hackathon with the link below:

[Wir Vs Virus Hackathon Website](https://wirvsvirushackathon.org/)

# WarenRadar
<p align="center">
<img src="https://github.com/mschoeffel/WirVsVirus-MarketSupplyChecker/blob/master/assets/WarenRadarLogo.png?raw=true" height="200px" alt="WarenRadarLogo" \>
</p>

"Warenradar" was the solution our team came up with. Facing the problem of grocery shopping in times of scarce goods.

## Projekt
<p align="center">
<img src="https://github.com/mschoeffel/WirVsVirus-MarketSupplyChecker/blob/master/assets/Manual.png?raw=true" alt="WarenRadarManual" \>
</p>

[Demo (Limited time)](http://marketsupplycheckerbalancer-1911037543.us-east-1.elb.amazonaws.com/)\
[UI/UX](https://www.figma.com/file/p1icmELR5aR8TI0OGz6aT7/WarenRadar?node-id=0%3A1)\
[YouTube Presentation](https://www.youtube.com/watch?v=h_HVPFjTyrk&feature=youtu.be)\
[DevPost](https://devpost.com/software/team-marketsupplychecker-mengenregister-der-supermarktware)

## Contributor

Name | Reponsibilities | Link
---- | ----- | -----
Alexander Just | Organisation, Data research, Presentation | [Xing](https://www.xing.com/profile/Alexander_Just8)
Christian Hölscher | Database, Data research, Presentation | [Xing](https://www.xing.com/profile/Christian_Hoelscher12) [GitHub](https://github.com/Roknix)
Pascal Kuhlmann | Backend & Frontend development | [Xing](https://www.xing.com/profile/Pascal_Kuhlmann2) [Github](https://github.com/Paku580)
Gina Malchar | UI/UX Design | [Xing](https://www.xing.com/profile/Gina_Malchar) [Behance](https://www.behance.net/ginamamalchar)
Michael Schöffel | Backend & Frontend development, Hosting | [Xing](https://www.xing.com/profile/Michael_Schoeffel5) [Github](https://github.com/mschoeffel)

## Licence 

This project is served with the GPLv3 license.\
[Licence](https://github.com/mschoeffel/WirVsVirus-MarketSupplyChecker/blob/master/LICENCE.md)

## Vorraussetzungen

### Maven
Maven has to be installed.

### Setup MySql Docker Container
A MySql Docker container needs to be running

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