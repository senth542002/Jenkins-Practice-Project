package com.jenkins.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class JenkinsSampleController {
	
	@GetMapping("/greetings")
	public String sayHello() {
		return "Hello!!!";
	}

}
