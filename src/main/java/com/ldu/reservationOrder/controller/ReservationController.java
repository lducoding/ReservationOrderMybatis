package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.dto.ReservationDto;
import com.ldu.reservationOrder.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @PostMapping("/reservation")
    public ResponseEntity<Integer> postReservation(@RequestBody ReservationDto reservationDto) {
        HttpHeaders httpHeaders = new HttpHeaders();

        reservationService.postReservation(reservationDto);

        return new ResponseEntity<Integer>(1, httpHeaders, HttpStatus.OK);
    }
}
