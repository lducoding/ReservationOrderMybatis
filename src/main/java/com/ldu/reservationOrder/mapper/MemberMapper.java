package com.ldu.reservationOrder.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    @Select("select role from member where id = #{id}")
    Optional<String> chkRole(String id);
}
