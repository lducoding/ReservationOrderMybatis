package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.config.jwt.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

//    @Secured("ROLE_USER")
    @GetMapping("/res/hello")
    public String hello(Model model, HttpServletResponse response) {
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("test","test");
        map.put("ldu","이동욱");
        return "123";
    }


}
