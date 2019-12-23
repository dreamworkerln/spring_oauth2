package com.marcosbarbero.lab.sec.oauth.opaque.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("/me")
    public ResponseEntity<Principal> get(final Principal principal) {
        return ResponseEntity.ok(principal);
    }


    // curl -u clientId:secret -X POST localhost:9001/oauth/token --data "grant_type=password&username=user&password=pass"
    // curl -u clientId:secret -i localhost:9001/oauth/check_token --data "token=ACCESS_TOKEN"
    // curl -u clientId:secret -i localhost:9001/oauth/token  --data "grant_type=refresh_token&refresh_token=REFRESH_TOKEN"

}
