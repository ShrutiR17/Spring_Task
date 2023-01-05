package com.taskmanagements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class TaskmanagementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagementsApplication.class, args);
	}

}
