package com.ldu.reservationOrder.config.jwt;

import com.ldu.reservationOrder.mapper.MemberMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {

    private MemberMapper memberMapper;

    public JwtAuthorizationFilter(AuthenticationManager authenticationManager, MemberMapper memberMapper) {
        super(authenticationManager);
        memberMapper = this.memberMapper;
    }
}
