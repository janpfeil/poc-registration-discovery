# poc-registration-descovery

Ziele:
In diesem Proof of Concept (POC) soll:

 1. mit Eureka ein Registry angelegt werden.
 2. mind. zwei Services (Spring Boot) erzeugt werden, die sich in Eureka registrieren und den gleichen Namen besitzen.
 3. ein Client angelegt werden, der die Services über die Registry anfragt. Und die Services an Hand der Informationen, die von der Eureka Registry geliefert werden aufruft.






# How to run:
to start Eureka:
Go to the folder server and enter: mvn spring-boot:run
/ Eureka Server in Browser:
http://localhost:8761/


to start service that registry in Eureka:
go to the folder service1 or service2 and enter: mvn spring-boot:run

to call it in Browser, enter: 
http://localhost:8085/service-instances/service-8081 , 
http://localhost:8085/service-instances/service-8082


