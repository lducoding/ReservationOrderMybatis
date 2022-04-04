package com.ldu.reservationOrder.config.jwt;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {


    public JwtAuthorizationFilter(AuthenticationManager authenticationManager) { //, UserRepository userRepository
        super(authenticationManager);
//        this.userRepository = userRepository;
    }
}
