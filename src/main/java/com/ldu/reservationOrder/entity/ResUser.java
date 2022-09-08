package com.ldu.reservationOrder.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties( ignoreUnknown = true )
public class ResUser {

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
