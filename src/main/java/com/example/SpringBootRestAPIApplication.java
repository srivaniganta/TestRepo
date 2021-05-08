package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestAPIApplication {

	public static void main(String[] args) {
		System.out.println("TEST");
		SpringApplication.run(SpringBootRestAPIApplication.class, args);
	}
	
	public class CustomContainer implements 
  WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        factory.setContextPath("");
        factory.setPort(8080);
    }
}

}
