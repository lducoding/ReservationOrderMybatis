package com.ldu.reservationOrder.dto;

import com.ldu.reservationOrder.entity.Menu;
import lombok.Data;

import java.util.List;

@Data
public class RestaurantDetail {

    private final Long restaurantId;
    private final List<Menu> menuList;
    private final Long goalId;
    private final String location;
    private final String restaurantName;
    private final String category;
    private final int standardTime;
}
