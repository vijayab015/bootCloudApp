package com.vbharti.springBoot.MyCoolApplication.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	@GetMapping("/")
	public String sayHello()
	{
		System.out.println("Hello Spring Boot Server Time is " +LocalDateTime.now());
		return "Hello Spring Boot Server Time is " +LocalDateTime.now();
	}
	
	@GetMapping("/greet")
	public String sayGreet()
	{
		
		return "Hello Good Morning  ";
	}
	
	@GetMapping("/tip")
	public String tip()
	{
		
		return "Hello You should run 5 KM every day. ";
	}
	

}
