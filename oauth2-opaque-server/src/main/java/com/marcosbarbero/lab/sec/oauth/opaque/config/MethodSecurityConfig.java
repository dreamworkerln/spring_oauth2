package com.marcosbarbero.lab.sec.oauth.opaque.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true,
        jsr250Enabled = true)
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {

//    // Deny Access on Missing @PreAuthorize(@Secured) to Spring Controller Methods by Default
//    // https://www.baeldung.com/spring-deny-access
//    @Override
//    protected MethodSecurityMetadataSource customMethodSecurityMetadataSource() {
//        return new CustomPermissionAllowedMethodSecurityMetadataSource();
//    }


}
