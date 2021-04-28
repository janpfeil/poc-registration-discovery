# poc-registration-descovery

to start Eureka:
Go to the folder server and enter: mvn spring-boot:run
/ Eureka Server in Browser:
http://localhost:8761/


to start service that registry in Eureka:
go to the folder service1 or service2 and enter: mvn spring-boot:run

to call it in Browser, enter: 
http://localhost:8085/service-instances/service-8081 , 
http://localhost:8085/service-instances/service-8082


