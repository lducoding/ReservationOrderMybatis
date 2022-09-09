package com.ldu.reservationOrder.dto;

import com.ldu.reservationOrder.entity.Goal;
import com.ldu.reservationOrder.entity.Menu;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Data
public class RestaurantDetailDto {

    private final Long restaurantId;
//    private final List<Menu> menuList;
    private final String location;
    private final String restaurantName;
    private final String category;
    private final int standardTime;
    private final Goal goal;

    public RestaurantDetailDto(Long restaurantId, String location, String restaurantName, String category, int standardTime, Goal goal) {
        this.restaurantId = restaurantId;
        this.location = location;
        this.restaurantName = restaurantName;
        this.category = category;
        this.standardTime = standardTime;
        this.goal = goal;
    }
}
