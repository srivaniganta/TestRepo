package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

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
        factory.setPort(9092);
    }
}

}
