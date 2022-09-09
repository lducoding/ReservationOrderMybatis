package com.ldu.reservationOrder.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Goal {

    private Long goalId;
//    private Long restaurantId;
    private String goalType;
    private int goalMoney;
    private int recentMoney;
    private String success;
    private String registerDate;


}
