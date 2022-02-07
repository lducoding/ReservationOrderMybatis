package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.Restaurant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("select * from restaurant")
    List<Restaurant> findAllRestaurant();
}
