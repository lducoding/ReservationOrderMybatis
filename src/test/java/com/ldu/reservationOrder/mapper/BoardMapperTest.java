package com.ldu.reservationOrder.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Autowired
    private MemberRepository memberMapper;

    @Test
    public void 모든레스토랑불러오기() {
        List<Restaurant> allRestaurant = boardMapper.findAllRestaurant();
        assertThat(allRestaurant.size()).isEqualTo(7);
    }

    @Test
    public void 레스토랑상세보기() {
        String id = "3";
        Restaurant restaurant = boardMapper.restaurantStatus(id);
        assertThat(restaurant.getId()).isEqualTo(3);
    }
    
    @Test
    public void 레스토랑예약현황보기() {
        String id = "1";
        ReservationTime reservationTime = boardMapper.showReservation(id);
        assertThat(reservationTime.getT0H()).isEqualTo("1");
    }

    @Test
    public void chkRole권한체크() {
        String id = "customer";
        Optional<String> role = memberMapper.chkRole(id);
        assertThat(role.get()).isEqualTo("customer");
    }
}
