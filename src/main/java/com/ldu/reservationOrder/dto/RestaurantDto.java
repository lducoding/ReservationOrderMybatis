package com.ldu.reservationOrder.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RestaurantDto {

    private final Long restaurant_id;
    private final Long res_user_id;
    private final Long goal_id;
    private final String location;
    private final String restaurant_name;
    private final String category;
    private final int standard_time;
}
