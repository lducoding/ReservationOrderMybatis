package com.ldu.reservationOrder.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class UserInfo {

    private int id;
    private String username;
    private String password;
//    private char enabled;
//    private String birth;
//    private String phone;
//    private String email;
    private String roles;

    public List<String> getRoleList() {
        if(this.roles.length() > 0) {
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }
}
