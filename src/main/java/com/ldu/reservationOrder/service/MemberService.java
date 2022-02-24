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
public class MemberService implements UserDetailsService{

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String chkRole(String id) {
        Optional<String> role = memberMapper.chkRole(id);
        return role.get();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userEntity = memberMapper.getUserInfo(username);
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
        userEntity.setRole(memberMapper.getUserRole(userEntity.getId()));
        List<GrantedAuthority> authorities = new ArrayList<>();

        if (("seller").equals(userEntity.getRole())) {
            authorities.add(new SimpleGrantedAuthority(Role.SELLER.getValue()));
        } else {
            authorities.add(new SimpleGrantedAuthority(Role.CUSTOMER.getValue()));

        }

        return new User(userEntity.getUsername(), userEntity.getPassword(), authorities);
    }


//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserInfo userInfo = memberMapper.getUserInfo(username);
//        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
//        String role = chkRole(String.valueOf(userInfo.getId()));
//        userInfo.setRole(role);
//
//        UserDetails userDetails = new UserDetails() {
//            @Override
//            public Collection<? extends GrantedAuthority> getAuthorities() {
//                List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//                grantedAuthorities.add(new SimpleGrantedAuthority(chkRole(String.valueOf(userInfo.getId()))));
//                return grantedAuthorities;
//            }
//
//            @Override
//            public String getPassword() {
//                return userInfo.getPassword();
//            }
//
//            @Override
//            public String getUsername() {
//                return userInfo.getUsername();
//            }
//
//            @Override
//            public boolean isAccountNonExpired() {
//                return true;
//            }
//
//            @Override
//            public boolean isAccountNonLocked() {
//                return true;
//            }
//
//            @Override
//            public boolean isCredentialsNonExpired() {
//                return true;
//            }
//
//            @Override
//            public boolean isEnabled() {
//                return true;
//            }
//        };
//        return userDetails;
//    }

}

