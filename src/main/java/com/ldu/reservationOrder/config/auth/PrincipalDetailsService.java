package com.ldu.reservationOrder.config.auth;

import com.ldu.reservationOrder.dto.UserInfo;
import com.ldu.reservationOrder.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {

    @Autowired
    private MemberMapper memberMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("findusername:");
//        User userEntity = userRepository.findByUsername(username);
        UserInfo userInfo = memberMapper.getUserInfo(username);
        return new PrincipalDetails(userInfo);
    }
}
