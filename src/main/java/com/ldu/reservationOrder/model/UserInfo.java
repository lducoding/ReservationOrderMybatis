package com.ldu.reservationOrder.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class UserInfo {

    private Long id;
    private String pass;
    private String name;
    private String email;
    private UserRole roles;
    private String birth;
    private int mileage;

    public List<String> getRoleList() {
        if(this.roles != null) {
            return Stream.of(UserRole.values()).map(Enum::name).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
}
