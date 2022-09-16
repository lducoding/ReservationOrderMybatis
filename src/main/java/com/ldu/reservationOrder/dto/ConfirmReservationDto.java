package com.ldu.reservationOrder.dto;

import lombok.Data;

import java.util.List;

@Data
public class ConfirmReservationDto {
    private Long resUserId;
    private Long restaurantId;
    private String reservationDate;
    private String reservationStatus;
    private List<MenuDto> menuList;
}
