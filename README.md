## In diesem Proof of Concept (POC) soll:

 1. mit Eureka ein Registry angelegt werden.
 2. mind. zwei Services (Spring Boot) erzeugt werden, die sich in Eureka registrieren und den gleichen Namen besitzen.
 3. ein Client angelegt werden, der die Services über die Registry anfragt. Und die Services an Hand der Informationen, die von der Eureka Registry geliefert werden aufruft.


## How to run:
1. to start Eureka: 
Go to the folder [poc-registration-descovery](https://github.com/obeidi/poc-registration-descovery)/[server](https://github.com/obeidi/poc-registration-descovery/tree/master/server)/ and enter:
**mvn spring-boot:run** 
View Eureka in your browser.:
http://localhost:8761/

2. to start the 2 service that registry in Eureka:
go to the folder [poc-registration-descovery](https://github.com/obeidi/poc-registration-descovery)/[service1](https://github.com/obeidi/poc-registration-descovery/tree/master/service1) or [poc-registration-descovery](https://github.com/obeidi/poc-registration-descovery)/[service2](https://github.com/obeidi/poc-registration-descovery/tree/master/service2) and enter: **mvn spring-boot:run**
to call it in Browser, enter: 
http://localhost:8085/service-instances/service-8081 
http://localhost:8085/service-instances/service-8082



> Written with [StackEdit](https://stackedit.io/).
