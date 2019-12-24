package com.marcosbarbero.lab.sec.oauth.opaque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// Взято за основу
// https://blog.marcosbarbero.com/oauth2-centralized-authorization-opaque-jdbc-spring-boot2/
// https://blog.marcosbarbero.com/centralized-authorization-jwt-spring-boot2/

@SpringBootApplication
public class OAuth2ServerOpaqueApplication {

    public static void main(String... args) {
        SpringApplication.run(OAuth2ServerOpaqueApplication.class, args);
    }

}
