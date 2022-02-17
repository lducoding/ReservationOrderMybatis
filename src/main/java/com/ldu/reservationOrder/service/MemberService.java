package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public void login(String id, String password) {
        int chkRole = chkRole(id);


    }

    public int chkRole(String id) {
        Optional<String> role = memberMapper.chkRole(id);
        if(role.isPresent()) {
            if (role.get().equals("customer")) {
                return 1;
            } else if (role.equals("seller")) {
                return 2;
            }
        }
            return 0;
    }
}

