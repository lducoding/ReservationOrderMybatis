package com.ldu.reservationOrder.mapper;

import com.ldu.reservationOrder.dto.ConfirmReservationDto;
import com.ldu.reservationOrder.dto.ReservationDto;
import com.ldu.reservationOrder.dto.UserReservationDto;
import com.ldu.reservationOrder.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ReservationMapper {

    void registerReservation(ReservationDto reservationDto);

    void registerReservationMenu(@Param("reservationId") Long reservationId,@Param("menuId") Long menuId);

    List<ConfirmReservationDto> registerReservationConfirm(@Param("reservationId") Long id);

    List<UserReservationDto> getUserReservationList(@Param("userId") Long userId, @Param("userRole") String userRole);

    @Update("update RESERVATION set reservation_status = #{status} where reservation_id = #{reservationId}")
    Long updateReservationStatus(@Param("reservationId") Long reservationId,@Param("status") String status);
}
