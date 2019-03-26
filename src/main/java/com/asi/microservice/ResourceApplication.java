package com.asi.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:camel-context.xml"})
public class ResourceApplication extends SpringBootServletInitializer {
	private static final Logger log = LoggerFactory.getLogger(ResourceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ResourceApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ResourceApplication.class);
	}
	
}
