package com.ldu.reservationOrder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    SELLER("SELLER"),
    CUSTOMER("CUSTOMER"),
    ADMIN("ADMIN");

    private String value;
}
