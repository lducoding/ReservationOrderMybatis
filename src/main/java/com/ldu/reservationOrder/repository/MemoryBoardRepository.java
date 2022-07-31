package com.ldu.reservationOrder.repository;

import com.ldu.reservationOrder.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryBoardRepository implements BoardRepository {

        Restaurant restaurant = new Restaurant();
        List<Restaurant> restaurantList =  new ArrayList<>();


    @Override
    public List<Restaurant> findAllRestaurant() {
        restaurant.setId(12);
        restaurant.setName("알이꽉 찬 간장게장");
        restaurant.setLocation("광주");
        restaurant.setDaily_profit("10");
        restaurant.setWeekly_profit("100");
        restaurantList.add(restaurant);
        return restaurantList;
    }
}
