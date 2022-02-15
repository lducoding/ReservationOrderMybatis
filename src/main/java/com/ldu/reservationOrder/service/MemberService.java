package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public void login(String id, String password) {
        int role = chkRole(id);

    }

    public int chkRole(String id) {
        String role = memberMapper.chkRole(id);
        if(role.equals("customer")) {
            return 1;
        } else if(role.equals("seller")) {
            return 2;
        } else {
            return 0;
        }
    }
}

