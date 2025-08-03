package com.nt.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class SchedulingTest {

       

	//@Scheduled(fixedDelay = 5000)	
	//@Scheduled(initialDelay = 3000, fixedDelay = 5000)	
	
	//@Scheduled(fixedRateString = "3000", fixedDelayString = "2000") // we can not apply both at once
	
	@Scheduled(initialDelayString = "2000", fixedRateString = "3000")
	public void deposite() {                    // return type allow but there is no one to catch it, Coz calling method is done by IOC container
			System.out.println("deposite() :: "+ new Date());
			System.out.println("Thread name :: "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	@Scheduled(initialDelayString = "2000", fixedRateString = "3000")
	public void withdraw() {
			System.out.println("withdraw() :: "+ new Date());
			System.out.println("Thread name :: "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
}
