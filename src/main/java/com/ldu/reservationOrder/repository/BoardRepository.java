package com.ldu.reservationOrder.repository;

import com.ldu.reservationOrder.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {

    List<Restaurant> findAllRestaurant();
}
