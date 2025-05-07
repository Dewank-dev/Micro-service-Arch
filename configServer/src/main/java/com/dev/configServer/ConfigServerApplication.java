package com.dev.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args){
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}


