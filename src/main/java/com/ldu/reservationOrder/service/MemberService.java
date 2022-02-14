package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public void login(String id, String password) {
    }

    public int chkId(String id) {
        String role = memberMapper.chkId(id);
        if(role==null) {
            return 0
        } else if(role.equals("customer")) {
            return 1
        } else if(role.equals("seller")) {
            return 2
        }
    }
}

