package com.nt.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class SchedulingTest {

       //POINT OF TIME
	//@Scheduled(cron="* * * * * *")                   //every seconds
	//@Scheduled(cron="1 * * * * *")                      //every minute at second 01
	//@Scheduled(cron="0 * * * * *")            //every minute
	//@Scheduled(cron="0 0 * * * *")            //every hour
	//@Scheduled(cron=" 0 0 0 * * *")          //at 00:00
	//@Scheduled(cron="0 0 0 1 * *")            //at 00:00 at 1(first) day
	//@Scheduled(cron="0 0 0 1 1 1") 
	
	//@Scheduled(cron="1 0 0 27 3 *")
	//@Scheduled(cron="0 0 8 15 8 *")
	//@Scheduled(cron="0 15-30 9 ? 9 SUN#4")
	//@Scheduled(cron="0 8 8,10 * * SAT-SUN")
	//@Scheduled(cron="0 20-30 6 * 3 MON#2")
	
	     // PERIOD OF TIME
	//@Scheduled(cron="0/10 14 11 2 8 *")  //14 min 11 hour 2 Aug having every 10 sec gap
	//@Scheduled(cron="0 15/5 4 * * *")
	//@Scheduled(cron="0/20 5,30 5 * * *") //"Run every day at 5:05 and 5:30 AM, every 20 seconds during that minute."
	//@Scheduled(cron = "0 0 10 ? * SUN")//10:00 at sunday
	//@Scheduled(cron="0 0 0/1 ? * SAT,SUN")//every hour of SAT and SUN
	
	           //Macros
	//@Scheduled(cron="@hourly")
	//@Scheduled(cron="@daily")
	//@Scheduled(cron="@weekly")
	//@Scheduled(cron="@monthly")
	//@Scheduled(cron="@yearly")
	
	         //Last Day and Week days
	//@Scheduled(cron=" 0 0 0 L * *")    //last day of every month
	//@Scheduled(cron=" 0 0 10 ? * THU#1") //10:00 first Thursday for every month
	//@Scheduled(cron=" 0 0 0 L-3 * *") //every month last 3 day
	//@Scheduled(cron=" 0 0 0 1W * *")    // 1 week day
	@Scheduled(cron=" 0 0 0 LW * *")    //last week day
	public void deposite() {
		System.out.println("SchedulingTest.deposite()"+ new Date());
	}
	
}
