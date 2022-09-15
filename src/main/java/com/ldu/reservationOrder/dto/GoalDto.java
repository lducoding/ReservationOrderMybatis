package com.ldu.reservationOrder.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class GoalDto {

    private Long goalId;
    private Long restaurantId;
    private String goalType;
    private int goalMoney;
    private int recentMoney;
    private String success;
    private String registerDate;

}
