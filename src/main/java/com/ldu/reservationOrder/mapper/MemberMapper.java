package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.UpdatePasswordDto;
import com.ldu.reservationOrder.entity.ResUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    @Select("select name from role where id = (select role_id from user_role where user_id = #{id})")
    Optional<String> chkRole(String id);

    @Select("select * from RES_USER where email = #{email}")
    ResUser getUserInfo(String email);

    @Select("select name from role where id = (select role_id from user_role where user_id = #{id})")
    String getUserRole(int id);

    @Select("select res_user_id, name, email, roles, birth, mileage from RES_USER where res_user_id = #{userId}")
    ResUser userInfo(Long userId);

    @Update("update RES_USER set pass = #{pass} where res_user_id = #{resUserId}")
    void updatePassword(UpdatePasswordDto updatePasswordDto);
}
