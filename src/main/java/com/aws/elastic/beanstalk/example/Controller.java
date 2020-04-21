package com.aws.elastic.beanstalk.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class Controller {

	@GetMapping
	public String start(){
		return "Hello DevOps..";
	}
}
