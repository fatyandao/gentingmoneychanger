# gentingmoneychanger#
Money Changer App for Genting

##Table Structure##
Currency
Exchange Rate
Transaction

##Core Functionality of the Application##
- Get Exchange Rates 
- Post Transactions 


##Functionality of Additional Items##
The repo for the items can be found here:

https://github.com/fatyandao/moneychanger-ui

- UI for Display Exchange Rates
- UI to submit transactions

##Deployment Instructions##
This is best run in Eclipse with Spring Tools Suites inserted.
However, you can use the Maven build and run the jar accordingly.

mvn spring-boot:run

Please also ensure that you have set up MySQL database as well. You can read up application.properties for the full instructions.

##Unit Testing Instructions##
mvn test

##Docuemntation##
The swagger documentation can be found here:
http://localhost:8086/swagger-ui.html
