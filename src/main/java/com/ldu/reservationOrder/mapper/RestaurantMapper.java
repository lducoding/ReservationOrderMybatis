package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.RestaurantDto;
import com.ldu.reservationOrder.dto.RestaurantSerchDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface RestaurantMapper {

    @Select("select * from restaurant")
    List<RestaurantDto> getRestaurantLists();

    void registerRestaurant(RestaurantDto restaurantDto);

    void updateRestaurant(@Param("id") Long id, @Param("updateParam") RestaurantDto restaurantDto);

    Optional<RestaurantDto> findById(Long id);

    List<RestaurantDto> findAll(RestaurantSerchDto restaurantSerchDto);
}
