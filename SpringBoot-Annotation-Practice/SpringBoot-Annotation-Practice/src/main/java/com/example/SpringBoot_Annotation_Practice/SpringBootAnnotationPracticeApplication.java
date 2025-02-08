package com.example.SpringBoot_Annotation_Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAnnotationPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAnnotationPracticeApplication.class, args);

		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
