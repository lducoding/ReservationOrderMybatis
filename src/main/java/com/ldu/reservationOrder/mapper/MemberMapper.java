package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    @Select("select name from role where id = 1")
    Optional<String> chkRole(String id);

    @Select("select * from member where username = #{username}")
    UserInfo getUserInfo(String username);
}
