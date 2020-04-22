package com.aws.elastic.beanstalk.example;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;

public class AppStack extends Stack {
	public AppStack(final Construct parent, final String id) {
		this(parent, id, null);
	}

	public AppStack(final Construct parent, final String id,
			final StackProps props) {
		super(parent, id, props);

		// Defines a new lambda resource
		final Function hello = Function.Builder
				.create(this, "HelloHandler")
				.runtime(software.amazon.awscdk.services.lambda.Runtime.JAVA_8) // execution		// environment
				.code(Code.fromAsset("src/main/java/com/aws/elastic/beanstalk/example")) // code loaded from the "lambda"												// directory
				.handler("LambdaRequestHandler.handler") // file is "hello", function is											// "handler"
				.build();
		
	}
}
