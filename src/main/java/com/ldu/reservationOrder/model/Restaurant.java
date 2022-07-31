package com.ldu.reservationOrder.model;

import lombok.Data;

@Data
public class Restaurant {

    int id;
    String name;
    String location;
    String daily_profit;
    String weekly_profit;

}
