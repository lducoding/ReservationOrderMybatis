package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.ReservationTime;
import com.ldu.reservationOrder.dto.Restaurant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("select * from restaurant")
    List<Restaurant> findAllRestaurant();

    @Select("select * from restaurant where id = #{id}")
    Restaurant restaurantStatus(String id);

    @Select("select * from time_table where res_id = #{res_id}")
    ReservationTime showReservation(String res_id);
}
