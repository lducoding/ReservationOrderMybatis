package com.ldu.reservationOrder.dto;

import com.ldu.reservationOrder.entity.Menu;
import lombok.Data;

import java.util.List;

@Data
public class ConfirmReservationDto {
    private Long resUserId;
    private Long restaurantId;
    private String reservationDate;
    private String reservationStatus;
    private List<Menu> menuList;
}
