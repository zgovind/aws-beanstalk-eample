package com.aws.elastic.beanstalk.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import software.amazon.awscdk.core.App;

@RequestMapping("/hello")
@RestController
public class Controller {

	@GetMapping
	public String createLambda(){
		 App app = new App();
	        new AppStack(app, "AppStack");
	        app.synth();
		return "Hello DevOps.. hello labmda is created! ";
	}
}
