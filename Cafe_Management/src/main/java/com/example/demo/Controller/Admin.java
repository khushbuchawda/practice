package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin {
	@GetMapping("/hello")
	public String addAdmin()
	{
		System.out.println("Customer Added");
		return "admin added";
	}

}
