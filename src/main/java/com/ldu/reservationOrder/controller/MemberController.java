package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/member/login")
    public String loginPage(Model model, @RequestParam Map<String, Object> params) {
        if(params.get("logout")!=null && params.get("logout").equals("")) {
            return "home";
        }
        return "member/loginPage";
    }

    @GetMapping("member/loginPage")
    public String loginSuccess(Model model) {
        return "home";
    }

    @GetMapping("/seller/test")
    @PreAuthorize("hasRole('SELLER')")
    public String sellerTest(Model model, Authentication authentication) {
        System.out.println(authentication.getAuthorities());
        System.out.println("여기인가"+authentication.getPrincipal());
        return "seller";
    }

    @GetMapping("/customer/test")
    @PreAuthorize("hasRole('CUSTOMER')")
    public String customerTest() {
        return "customer";
    }

}
