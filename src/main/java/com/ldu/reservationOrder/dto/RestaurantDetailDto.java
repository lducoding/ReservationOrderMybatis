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
//    private final List<Menu> menuList;
    private String location;
    private String restaurantName;
    private String category;
    private int standardTime;
    private GoalDto goalDto;

//    private void setGoalDto(Long goalId, String goalType, int goalMoney, int recentMoney, String success, String registerDate) {
//        this.goalDto = new GoalDto(goalId, goalType, goalMoney, recentMoney, success, registerDate);
//    }
}
