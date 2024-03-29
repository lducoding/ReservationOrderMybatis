//package com.ldu.reservationOrder.config;
//
//import com.ldu.reservationOrder.config.jwt.JwtAuthenticationFilter;
//import com.ldu.reservationOrder.config.jwt.JwtAuthorizationFilter;
//import com.ldu.reservationOrder.mapper.MemberMapper;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
//@RequiredArgsConstructor
//public class WebSecurityConfigDeprecated extends WebSecurityConfigurerAdapter {
//
//    private final CorsFilter corsFilter;
//    private final MemberMapper memberMapper;
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //세션을 사용하지 않겠다는 의미
//                .and()
//                .addFilter(corsFilter)
//                .formLogin().disable()
//                .httpBasic().disable()
//                .addFilter(new JwtAuthenticationFilter(authenticationManager()))
//                .addFilter(new JwtAuthorizationFilter(authenticationManager(), memberMapper))
//                .authorizeRequests()
////                .antMatchers("/res/hello").hasRole("CUSTOMER")
//                .anyRequest().permitAll();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
//
//}