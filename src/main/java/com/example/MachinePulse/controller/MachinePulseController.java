package com.example.MachinePulse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MachinePulse.service.MachinePulseService;

@RestController
@RequestMapping("/service")
public class MachinePulseController {

	@Autowired
	MachinePulseService soaDataService;

	@RequestMapping("/getLiveDataById")
	public String testService(){
		System.out.println("In machine pulse");
		return soaDataService.testService();
	}
	

}
