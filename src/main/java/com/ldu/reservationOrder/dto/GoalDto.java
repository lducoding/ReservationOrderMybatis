package com.ldu.reservationOrder.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GoalDto {

    private Long goalId;
    private String goalType;
    private int goalMoney;
    private int recentMoney;
    private String success;
    private String registerDate;

}
