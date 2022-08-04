package com.ldu.reservationOrder.config.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldu.reservationOrder.config.auth.PrincipalDetails;
import com.ldu.reservationOrder.model.UserInfo;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClaims;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    // POST로 /login 요청시 실행되는 함수
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            UserInfo userInfo = objectMapper.readValue(request.getInputStream(), UserInfo.class);
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                    new UsernamePasswordAuthenticationToken(userInfo.getEmail(), userInfo.getPass());
            Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
            return authentication;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private Map<String,Object> getJwtHeader(){
        Map<String,Object> jwtHeader = new HashMap<>();
        jwtHeader.put("alg","HS256");
        jwtHeader.put("typ","JWT");
        jwtHeader.put("create", System.currentTimeMillis());

        return jwtHeader;
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        PrincipalDetails principalDetails = (PrincipalDetails) authResult.getPrincipal();

//        String jwtToken = Jwts.builder().setSubject(principalDetails.getUserInfo().getEmail()).signWith(SignatureAlgorithm.HS256, DatatypeConverter.parseBase64Binary("donguking"))
//                .setExpiration(new Date(System.currentTimeMillis() + 1000000)).compact();


        String jwtToken = JWT.create()
                .withSubject("lduToken") // 토큰 이름
                .withExpiresAt(new Date(System.currentTimeMillis()+(60000*30))) // 토큰 유효시간
                .withClaim("id", principalDetails.getUserInfo().getRes_user_id())
                .withClaim("username", principalDetails.getUserInfo().getEmail())
                .sign(Algorithm.HMAC512("donguking")); // 암호화 비밀키

        response.addHeader("Authorization","Bearer "+jwtToken);
        Cookie jwtCookie = new Cookie("Authorization", "Bearer "+jwtToken);
        jwtCookie.setMaxAge(60*30*60);
        jwtCookie.setPath("/");
        jwtCookie.setSecure(true);
//        jwtCookie.setHttpOnly(true);
        response.addHeader("username", principalDetails.getUserInfo().getEmail());
        response.addCookie(jwtCookie);
    }
}
