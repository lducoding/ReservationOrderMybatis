package com.ldu.reservationOrder.service;


import com.ldu.reservationOrder.dto.Role;
import com.ldu.reservationOrder.dto.UserInfo;
import com.ldu.reservationOrder.mapper.MemberMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MemberService implements UserDetailsService {

    @Autowired
    private MemberMapper memberMapper;

    public void login(String username, String password) {
        int chkRole = chkRole(username);
        UserDetails userDetails = loadUserByUsername(username);
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

    @Transactional
    public void joinUser(UserInfo userInfo) {
        // 비밀번호 암호화
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));

//        return memberMapper.save(userInfo.toEntity()).getId();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Optional<UserInfo> userEntityWrapper = memberMapper.getUserInfo(username);
        UserInfo userInfo =  memberMapper.getUserInfo(username);
        userInfo.setRole(memberMapper.chkRole(userInfo.getUsername()).get());
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

        if (userInfo.getRole().equals("admin")) {
            authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
        } else {
            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
        }

        return new User(userInfo.getEmail(), userInfo.getPassword(), authorities);
    }
}

