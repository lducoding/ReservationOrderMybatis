package com.ldu.reservationOrder.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    @Select("select role from member where id = #{id}")
    String chkRole(String id);
}
