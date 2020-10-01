package com.github.fabriciolfj.springoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthApplication.class, args);
	}

}
