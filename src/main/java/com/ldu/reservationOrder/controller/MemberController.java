package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.dto.UserInfo;
import com.ldu.reservationOrder.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
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

    @GetMapping("/member/login")
    public String loginPage(Model model) {
        return "member/loginPage";
    }

    @GetMapping("/seller/test")
    public String sellerTest(Model model) {
        return "seller";
    }

    @GetMapping("/customer/test")
    public String customerTest() {
        return "customer";
    }

}
