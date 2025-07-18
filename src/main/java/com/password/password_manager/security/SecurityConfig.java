package com.password.password_manager.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/**").permitAll()
                        .requestMatchers(
                                "/swagger-ui/**",
                                "/swagger-ui.html",
                                "/v3/api-docs/**",
                                "/api-docs/**",
                                "/swagger-resources/**",
                                "/configuration/**",
                                "/webjars/**",
                                "/favicon.ico"
                        ).permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(withDefaults()) // abilita form login di default
            .csrf(csrf -> csrf.disable()); // da disabilitare solo in fase di sviluppo o con frontend sicuro

        return http.build();
    }
}