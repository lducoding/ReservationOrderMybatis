package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.dto.UserInfo;
import com.ldu.reservationOrder.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@AllArgsConstructor
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/member/loginPage")
    public String loginPage(Model model) {

        return "member/loginPage";
    }

    @GetMapping("/member/login")
    public String login(Model model, @RequestParam Map<String, String> params) {
        memberService.login(params.get("username"), params.get("password"));

        return "home";
    }
}
