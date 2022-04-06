package com.ldu.reservationOrder.service;


import com.ldu.reservationOrder.dto.Role;
import com.ldu.reservationOrder.dto.UserInfo;
import com.ldu.reservationOrder.mapper.MemberMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService{

    @Autowired
    private MemberMapper memberMapper;

    public String chkRole(String id) {
        Optional<String> role = memberMapper.chkRole(id);
        return role.get();
    }

}

