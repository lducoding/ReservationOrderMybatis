package com.ldu.reservationOrder.dto;

import lombok.Data;

@Data
public class MenuDto {
    private Long menuId;
    private Long restaurantId;
    private String menuName;
    private int menuPrice;
    private String menuImg;
}