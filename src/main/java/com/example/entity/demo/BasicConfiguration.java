package com.example.entity.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BasicConfiguration extends WebSecurityConfigurerAdapter {


    /**
     * This section defines the security policy for the app.
     * - BASIC authentication is supported (enough for this REST-based demo)
     * - /resources is secured using URL security shown below
     * - CSRF headers are disabled since we are only testing the REST interface,
     * not a web one.
     * <p>
     * NOTE: GET is not shown which defaults to permitted.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();
        http.cors().disable();
        http.antMatcher("*").anonymous();
        super.configure(http);
    }
}