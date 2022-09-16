package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.ConfirmReservationDto;
import com.ldu.reservationOrder.dto.ReservationDto;
import com.ldu.reservationOrder.dto.UserReservationDto;
import com.ldu.reservationOrder.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReservationMapper {

    void registerReservation(ReservationDto reservationDto);

    void registerReservationMenu(@Param("reservationId") Long reservationId,@Param("menuId") Long menuId);

    List<ConfirmReservationDto> registerReservationConfirm(@Param("reservationId") Long id);

    List<UserReservationDto> getUserReservationList(@Param("userId") Long userId, @Param("userRole") String userRole);
}
