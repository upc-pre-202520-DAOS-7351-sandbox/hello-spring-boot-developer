package com.acme.helloplatform;

import com.acme.helloplatform.generic.domain.model.entity.Developer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootDeveloperApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootDeveloperApplication.class, args);
        
        Developer mydeveloper = new Developer("John", "Doe");
        System.out.println(mydeveloper.getFullName());
	}

}
