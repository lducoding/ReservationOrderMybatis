package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.RestaurantDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface RestaurantMapper {

    @Select("select * from restaurant")
    List<RestaurantDto> getRestaurantLists();


}
