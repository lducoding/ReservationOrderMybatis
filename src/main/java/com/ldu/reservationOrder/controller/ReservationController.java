package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.dto.ConfirmReservationDto;
import com.ldu.reservationOrder.dto.ReservationDto;
import com.ldu.reservationOrder.dto.UserReservationDto;
import com.ldu.reservationOrder.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @PostMapping("/reservation")
    public ResponseEntity<Long> registerReservation(@RequestBody ReservationDto reservationDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        Long reservationId = reservationService.registerReservation(reservationDto);
        return new ResponseEntity<Long>(reservationId, httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/registerReservationConfirm/{reservationId}")
    public ResponseEntity<List<ConfirmReservationDto>> registerReservation(@PathVariable Long reservationId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        List<ConfirmReservationDto> confirmReservationDto = reservationService.registerReservationConfirm(reservationId);
        return new ResponseEntity<List<ConfirmReservationDto>>(confirmReservationDto, httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/userReservationList/{userId}")
    public ResponseEntity<List<UserReservationDto>> userReservationList(@PathVariable Long userId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        List<UserReservationDto> userReservationList = reservationService.getUserReservationList(userId);
        return new ResponseEntity<List<UserReservationDto>>(userReservationList, httpHeaders, HttpStatus.OK);
    }

}
