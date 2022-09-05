package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;
import java.util.Optional;

@Mapper
public interface MemberRepository {

    @Select("select name from role where id = (select role_id from user_role where user_id = #{id})")
    Optional<String> chkRole(String id);

    @Select("select * from RES_USER where email = #{email}")
    UserInfo getUserInfo(String email);

    @Select("select name from role where id = (select role_id from user_role where user_id = #{id})")
    String getUserRole(int id);

}
