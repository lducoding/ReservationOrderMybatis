package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.dto.ReservationDto;
import com.ldu.reservationOrder.mapper.ReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationMapper reservationMapper;

    public void postReservation(ReservationDto reservationDto) {
        reservationMapper.registerReservation(reservationDto);

        for (Long menuId : reservationDto.getMenuIdList())
            reservationMapper.registerReservationMenu(reservationDto.getReservationId(), menuId);
    }
}
