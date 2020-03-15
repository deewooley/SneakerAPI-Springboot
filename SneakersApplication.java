package com.example.sneakers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Controller: Annotate that the file is a SpringBoot Application
@SpringBootApplication
public class SneakersApplication {

	// Run program, SpringApplication.run(this ClassName.class)
	public static void main(String[] args) {

//		SpringApplication.run(SneakersApplication.class, and name of String Array in main method );
		SpringApplication.run(SneakersApplication.class, args);
	}

}
