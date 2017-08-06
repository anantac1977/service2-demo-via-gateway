package com.pocs.ananta.spring.cloud.service2demoviagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service2DemoViaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Service2DemoViaGatewayApplication.class, args);
	}
	@RequestMapping
	public String bye(){
		return "Good Bye";
	}
}
