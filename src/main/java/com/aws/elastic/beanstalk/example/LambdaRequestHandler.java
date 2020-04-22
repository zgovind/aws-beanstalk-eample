package com.aws.elastic.beanstalk.example;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
public class LambdaRequestHandler implements RequestHandler<String, String> {
	
	public String handleRequest(String input, Context context)
	   {
		return "Hello World - " + input;
		
	   }		
}