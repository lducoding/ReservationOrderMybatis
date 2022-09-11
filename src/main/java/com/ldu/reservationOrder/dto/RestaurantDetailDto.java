package com.ldu.reservationOrder.dto;

import com.ldu.reservationOrder.entity.Goal;
import com.ldu.reservationOrder.entity.Menu;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Data
@RequiredArgsConstructor
public class RestaurantDetailDto {

    private Long restaurantId;
    private List<Menu> menuList;
    private String location;
    private String restaurantName;
    private String category;
    private int standardTime;
    private GoalDto goalDto;

}
