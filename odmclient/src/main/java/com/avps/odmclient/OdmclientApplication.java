package com.avps.odmclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.avps")
@SpringBootApplication
public class OdmclientApplication {

  
	public static void main(String[] args) {
		SpringApplication.run(OdmclientApplication.class, args);
	}

}
