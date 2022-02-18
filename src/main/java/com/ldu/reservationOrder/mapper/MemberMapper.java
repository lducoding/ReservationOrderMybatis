package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    @Select("select role from member where id = #{id}")
    Optional<String> chkRole(String id);

    @Select("select * from member where id = #{insertedId}")
    UserInfo getUserInfo(String insertedId);
}
