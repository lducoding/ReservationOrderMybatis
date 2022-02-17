package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.dto.ReservationTime;
import com.ldu.reservationOrder.dto.Restaurant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BoardServiceTest {

    @Autowired
    BoardService boardService;

    @Autowired
    MemberService memberService;

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

    @Test
    public void 레스토랑예약현황보기() {
        String id = "1";
        ReservationTime reservationTime = boardService.showReservation(id);
        assertThat(reservationTime.getT0H()).isEqualTo("1");
    }

    @Test
    public void chkRole권한체크() {
        String id = "nu";
        int integer = memberService.chkRole(id);
        assertThat(integer).isEqualTo(0);
    }
}
