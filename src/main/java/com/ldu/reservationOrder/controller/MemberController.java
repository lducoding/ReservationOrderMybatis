package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/member/loginPage")
    public String loginPage(Model model) {

        return "member/loginPage";
    }

    @PostMapping("/member/login")
    public String login(Model model, @RequestParam Map<String, String> params) {
        int who = memberService.chkId(params.get("id"));
        memberService.login(params.get("id"), params.get("password"));
        return "home";
    }
}
