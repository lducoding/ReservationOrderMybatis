package com.ldu.reservationOrder.config.auth;

import com.ldu.reservationOrder.model.UserInfo;
import com.ldu.reservationOrder.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

// http://localhost:8080/login 하면 일로 와야 하는데 안옴 formlogin().disabled해서
@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {

    private final MemberMapper memberMapper;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User userEntity = userRepository.findByUsername(username);
        UserInfo userInfo = memberMapper.getUserInfo(email);
        PrincipalDetails principalDetails = new PrincipalDetails(userInfo);
        return principalDetails;
    }
}
