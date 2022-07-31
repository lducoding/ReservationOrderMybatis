package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.model.ReservationTime;
import com.ldu.reservationOrder.model.Restaurant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("select * from restaurant")
    List<Restaurant> findAllRestaurant();

    @Select("select * from restaurant where id = #{id}")
    Restaurant restaurantStatus(String id);

    @Select("select * from time_table where res_id = #{resId}")
    ReservationTime showReservation(String resId);

    @Select("SELECT menu FROM restaurant_menu WHERE restaurant_id = #{resId}")
    ArrayList<String> getResMenu(String resId);
}
