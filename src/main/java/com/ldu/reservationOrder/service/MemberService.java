package com.ldu.reservationOrder.service;


import com.ldu.reservationOrder.entity.ResUser;
import com.ldu.reservationOrder.mapper.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService{

    private final MemberRepository memberMapper;

    public String chkRole(String id) {
        Optional<String> role = memberMapper.chkRole(id);
        return role.get();
    }

    public ResUser userInfo(Long userId) {
        return memberMapper.userInfo(userId);
    }
}

