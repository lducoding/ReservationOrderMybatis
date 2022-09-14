package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.dto.ConfirmReservationDto;
import com.ldu.reservationOrder.dto.ReservationDto;
import com.ldu.reservationOrder.dto.UserReservationDto;
import com.ldu.reservationOrder.mapper.ReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationMapper reservationMapper;

    public Long registerReservation(ReservationDto reservationDto) {
        reservationMapper.registerReservation(reservationDto);

        for (Long menuId : reservationDto.getMenuIdList())
            reservationMapper.registerReservationMenu(reservationDto.getReservationId(), menuId);
        return reservationDto.getReservationId();
    }

    public List<ConfirmReservationDto> registerReservationConfirm(Long id) {
        return reservationMapper.registerReservationConfirm(id);
    }

    public List<UserReservationDto> getUserReservationList(Long userId) {
        return reservationMapper.getUserReservationList(userId);
    }
}
