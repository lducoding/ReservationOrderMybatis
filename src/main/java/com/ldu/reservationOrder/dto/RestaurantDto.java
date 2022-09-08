package com.ldu.reservationOrder.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RestaurantDto {

    private final Long restaurantId;
    private final Long resUserId;
    private final Long goalId;
    private final String location;
    private final String restaurantName;
    private final String category;
    private final int standardTime;
}
