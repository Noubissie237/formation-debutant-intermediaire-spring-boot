package com.propentatech.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
	1- @SpringBootConfiguration
	2- @EnableAutoConfiguration
	3- @ComponentScan
*/
public class FormationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormationApplication.class, args);
	}

}
