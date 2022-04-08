package com.ldu.reservationOrder.config.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldu.reservationOrder.config.auth.PrincipalDetails;
import com.ldu.reservationOrder.dto.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            UserInfo userInfo = objectMapper.readValue(request.getInputStream(), UserInfo.class);
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                    new UsernamePasswordAuthenticationToken(userInfo.getUsername(),userInfo.getPassword());
            Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
//            PrincipalDetails principalDetails = (PrincipalDetails) authentication.getPrincipal();
            return authentication;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        PrincipalDetails principalDetails = (PrincipalDetails) authResult.getPrincipal();

        String jwtToken = JWT.create()
                .withSubject("lduToken") // 토큰 이름
                .withExpiresAt(new Date(System.currentTimeMillis()+(60000*10))) // 토큰 유효시간
                .withClaim("id", principalDetails.getUserInfo().getId())
                .withClaim("username", principalDetails.getUserInfo().getUsername())
                .sign(Algorithm.HMAC512("donguking")); // 암호화 비밀키

//        response.addHeader("Authorization","Bearer "+jwtToken);
        Cookie jwtCookie = new Cookie("Authorization", jwtToken);
        jwtCookie.setMaxAge(60*30);
        jwtCookie.setPath("/");
        jwtCookie.setSecure(true);
//        jwtCookie.setHttpOnly(true);
        response.addCookie(jwtCookie);
    }
}
