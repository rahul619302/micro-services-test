package com.cg.services.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaServer
@CrossOrigin
public class ServicesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesServerApplication.class, args);
	}
}
