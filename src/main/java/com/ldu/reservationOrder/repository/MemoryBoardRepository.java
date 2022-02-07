package com.ldu.reservationOrder.repository;

import com.ldu.reservationOrder.dto.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryBoardRepository implements BoardRepository {

        Restaurant restaurant = new Restaurant();
        List<Restaurant> restaurantList =  new ArrayList<>();


    @Override
    public List<Restaurant> findAllRestaurant() {
        restaurant.setId(123);
        restaurant.setName("알이꽉 찬 간장게장");
        restaurantList.add(restaurant);
        return restaurantList;
    }
}
