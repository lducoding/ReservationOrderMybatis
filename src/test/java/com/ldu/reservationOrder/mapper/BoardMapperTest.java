package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.Restaurant;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void 모든레스토랑불러오기() {
        List<Restaurant> allRestaurant = boardMapper.findAllRestaurant();
        assertThat(allRestaurant.size()).isEqualTo(7);
    }
}
