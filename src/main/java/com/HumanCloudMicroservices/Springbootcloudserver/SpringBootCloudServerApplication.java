package com.HumanCloudMicroservices.Springbootcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringBootCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudServerApplication.class, args);
	}

}
