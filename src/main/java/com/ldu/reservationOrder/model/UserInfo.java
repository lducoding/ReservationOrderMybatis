package com.ldu.reservationOrder.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@JsonIgnoreProperties( ignoreUnknown = true )
public class UserInfo {

    private Long res_user_id;
    private String pass;
    private String name;
    private String email;
    private UserRole roles;
    private String birth;
    private int mileage;

//    public List<String> getRoleList() {
//        if(this.roles != null) {
//            return Stream.of(UserRole.values()).map(Enum::name).collect(Collectors.toList());
//        }
//        return new ArrayList<>();
//    }
}
