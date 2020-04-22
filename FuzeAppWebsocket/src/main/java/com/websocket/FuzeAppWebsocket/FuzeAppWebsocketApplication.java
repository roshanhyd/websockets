package com.websocket.FuzeAppWebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FuzeAppWebsocketApplication {

	public static void main(String[] args) {
		System.out.println("FuzeAppWebsocket Application Started");
		SpringApplication.run(FuzeAppWebsocketApplication.class, args);
	}

}
