package com.olive.schedular;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedularTest {
	@Scheduled(cron = "*/10 * * * * * ")
	public void m1() {
		System.out.println(" Hi...." + new Date());
		
	}

}
