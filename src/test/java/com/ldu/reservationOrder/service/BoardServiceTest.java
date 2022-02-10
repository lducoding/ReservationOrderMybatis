package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.dto.Restaurant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BoardServiceTest {

    @Autowired
    BoardService boardService;

    @Test
    void 음식점전체조회() {
        List<Restaurant> allRestaurant = boardService.findAllRestaurant();
        assertThat(allRestaurant.size()).isEqualTo(7);
    }

    @Test
    public void 음식점상세보기() {
        String id = "2";
        Restaurant restaurant = boardService.restaurantStatus(id);
        assertThat(restaurant.getId()).isEqualTo(2);
    }
}
