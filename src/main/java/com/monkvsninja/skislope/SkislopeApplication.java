package com.monkvsninja.skislope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class SkislopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkislopeApplication.class, args);
	}
}
