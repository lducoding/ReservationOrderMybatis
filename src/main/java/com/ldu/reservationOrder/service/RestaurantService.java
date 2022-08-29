package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.dto.RestaurantDto;
import com.ldu.reservationOrder.mapper.RestaurantMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantMapper restaurantMapper;

    public Optional<List<RestaurantDto>> getRestaurantLists() {
        return restaurantMapper.getRestaurantLists();
    }
}
