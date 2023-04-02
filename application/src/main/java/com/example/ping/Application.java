package com.example.ping;

import org.openapitools.api.PingApi;
import org.openapitools.client.api.InternalPingApi;
import org.openapitools.model.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
@RestController
@ComponentScan({"com.example.ping", "org.openapitools.client"})
public class Application implements PingApi {
    @Autowired
    private InternalPingApi internalPingApi;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public ResponseEntity<String> ping() {
        return internalPingApi.internalPingWithHttpInfo();
    }

    @ExceptionHandler(RestClientException.class)
    public ResponseEntity<Error> handleRestClientException(RestClientException ex) {
        var status = HttpStatus.SERVICE_UNAVAILABLE;
        return ResponseEntity
                .status(status)
                .body(new Error().message(status.getReasonPhrase()));
    }


}
