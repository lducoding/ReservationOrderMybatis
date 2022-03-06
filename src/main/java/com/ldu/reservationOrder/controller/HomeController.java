package com.ldu.reservationOrder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @RequestMapping("/api/hello")
    public Map<String,String> hello(Model model) {

        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("test","test");
        map.put("ldu","이동욱");

        return map;
    }

}
