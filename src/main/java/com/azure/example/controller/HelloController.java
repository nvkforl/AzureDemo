package com.azure.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hi")
	public String helloAzure() {
		return "Hello from Azure";
	}
}
