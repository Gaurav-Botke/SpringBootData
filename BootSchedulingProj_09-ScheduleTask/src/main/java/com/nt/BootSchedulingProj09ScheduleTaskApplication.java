package com.nt;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootSchedulingProj09ScheduleTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSchedulingProj09ScheduleTaskApplication.class, args);
		System.out.println("main() :: "+ new Date()+" "+ Thread.currentThread().getName());
	}

}
