package com.thymeleaft.stopservice.demo.service.implement;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

import com.thymeleaft.stopservice.demo.service.MyService;

@Service
public class MyServiceImpl implements MyService{
	
	 private Boolean serviceRunning = true;

	@Override
	public void stratService() throws InterruptedException {
		serviceRunning = true;
		while(serviceRunning) {
			System.out.println(" ia m running now : " + LocalTime.now());
			Thread.sleep(1000);
		}
	}

	@Override
	public void stopService() {
		
		//try stop service method
		
		System.out.println("try stop service method");
		
		this.serviceRunning = false;
		
	}

}
