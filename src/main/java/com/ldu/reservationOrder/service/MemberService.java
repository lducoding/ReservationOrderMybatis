package com.ldu.reservationOrder.service;


import com.ldu.reservationOrder.mapper.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService{

    @Autowired
    private MemberRepository memberMapper;

    public String chkRole(String id) {
        Optional<String> role = memberMapper.chkRole(id);
        return role.get();
    }

}

