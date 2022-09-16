package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.dto.*;
import com.ldu.reservationOrder.entity.Menu;
import com.ldu.reservationOrder.mapper.RestaurantMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantMapper restaurantMapper;

    public List<RestaurantDto> getRestaurantLists() {
        return restaurantMapper.getRestaurantLists();
    }

    public List<RestaurantDto> getSearchRestaurantLists(RestaurantSerchDto restaurantSerchDto) {
        return restaurantMapper.getSearchRestaurantLists(restaurantSerchDto);
    }

    public RestaurantDetailDto getRestaurantDetail(Long id) {
        return restaurantMapper.getRestaurantDetail(id);
    }

    public Long registerRestaurant(RestaurantDto restaurantDto) {
        restaurantMapper.registerRestaurant(restaurantDto);
        return restaurantDto.getRestaurantId();
    }

    public Long registerGoal(GoalDto goalDto) {
        restaurantMapper.registerGoal(goalDto);
        return goalDto.getGoalId();
    }

    public void registerMenu(MenuListDto menuListDto) {
        for (Menu menu : menuListDto.getMenuList()) {
            restaurantMapper.registerMenu(menu);
        }
    }
}
