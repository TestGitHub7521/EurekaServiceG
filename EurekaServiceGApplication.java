package com.fedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServiceGApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(EurekaServiceGApplication.class, args);
    }
	
	@RestController
	public class HelloController {
		
		@RequestMapping("/hello")
		public String sayHello()
		{
			return "Eureka Service Demo";
		}
		
		
	}

	
	

}
