package io.schultz.dustin.todoapp.customEndpoints;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

//@Component
//public class CustomSecurityEndpoint extends WebSecurityConfigurerAdapter {
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.requestMatcher(EndpointRequest.toAnyEndpoint())
//                .authorizeRequests((req) -> req.anyRequest().hasRole("ADMIN"));
//
//        http.httpBasic();
//    }
//}
