package com.example.SpringBoot_Annotation_Practice;

import com.example.SpringBoot_Annotation_Practice.model.Alien;
import com.example.SpringBoot_Annotation_Practice.model.Laptop;
import com.example.SpringBoot_Annotation_Practice.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAnnotationPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAnnotationPracticeApplication.class, args);

		LaptopService laptopService = context.getBean(LaptopService.class);

		Laptop laptop = context.getBean(Laptop.class);

		laptopService.addLaptop(laptop);
	}

}
