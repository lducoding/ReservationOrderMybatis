package com.ldu.reservationOrder.dto;

public class Restaurant {

    int id;
    String name;
    String location;
    String daily_profit;
    String weekly_profit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDaily_profit() {
        return daily_profit;
    }

    public void setDaily_profit(String daily_profit) {
        this.daily_profit = daily_profit;
    }

    public String getWeekly_profit() {
        return weekly_profit;
    }

    public void setWeekly_profit(String weekly_profit) {
        this.weekly_profit = weekly_profit;
    }
}
