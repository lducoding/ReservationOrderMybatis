package com.ldu.reservationOrder.entity;

import lombok.Data;

@Data
public class Menu {
    private Long menuId;
    private Long restaurantId;
    private String menuName;
    private int menuPrice;
    private String menuImg;
}
