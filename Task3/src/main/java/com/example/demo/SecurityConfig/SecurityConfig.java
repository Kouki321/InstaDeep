package com.example.demo.SecurityConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/professors").permitAll() // Allow unauthenticated access
                .anyRequest().authenticated() // Require authentication for other requests
                .and()
                .httpBasic(); // Use basic authentication

        return http.build();
    }
}
