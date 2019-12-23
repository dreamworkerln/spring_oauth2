package com.marcosbarbero.lab.sec.oauth.opaque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication//(exclude = { SecurityAutoConfiguration.class }) // disable default boot security config
public class OAuth2ServerOpaqueApplication {

    public static void main(String... args) {
        SpringApplication.run(OAuth2ServerOpaqueApplication.class, args);
    }

}
