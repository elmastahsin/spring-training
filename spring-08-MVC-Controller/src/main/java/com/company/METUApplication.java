package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//SpringBootApplication is a combination of @Configuration, @EnableAutoConfiguration, @ComponentScan
// @Configuration: tags the class as a source of bean definitions for the application context.
// @EnableAutoConfiguration: tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
// @ComponentScan: tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.
//@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class METUApplication {

	public static void main(String[] args) {
		SpringApplication.run(METUApplication.class, args);




	}

}
