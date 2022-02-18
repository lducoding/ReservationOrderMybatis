package com.ldu.reservationOrder.dto;

import lombok.Data;

@Data
public class UserInfo {

    private int id;
    private String username;
    private String password;
    private char enabled;
    private String birth;
    private String phone;
    private String email;
}
