package service1.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Dieser Serivce regestiert sich mit der @EnableEurekaClient Annotation am dem Eureka-Server
 * @author ahmadobeidi
 *
 */

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class ServiceRegistrationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistrationClientApplication.class, args);
	}
}
