package com.example.ping;

import org.openapitools.api.InternalPingApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PingServiceApplication implements InternalPingApi {

	public static void main(String[] args) {
		SpringApplication.run(PingServiceApplication.class, args);
	}

	@Override
	public ResponseEntity<String> internalPing() {
		return ResponseEntity.ok("pong");
	}
}
