package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.config.auth.PrincipalDetails;
import com.ldu.reservationOrder.dto.ConfirmReservationDto;
import com.ldu.reservationOrder.dto.ReservationDto;
import com.ldu.reservationOrder.dto.UserReservationDto;
import com.ldu.reservationOrder.entity.UserRole;
import com.ldu.reservationOrder.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Collection;
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

    @GetMapping("/userReservationList/{id}")
    public ResponseEntity<List<UserReservationDto>> userReservationList(@PathVariable Long id, @AuthenticationPrincipal PrincipalDetails principalDetails) {
        HttpHeaders httpHeaders = new HttpHeaders();
        UserRole roles = principalDetails.getUserInfo().getRoles();
        List<UserReservationDto> userReservationList = reservationService.getUserReservationList(id, String.valueOf(principalDetails.getUserInfo().getRoles()));
        return new ResponseEntity<List<UserReservationDto>>(userReservationList, httpHeaders, HttpStatus.OK);
    }

    @PutMapping("/reservationStatus")
    public ResponseEntity<Long> updateReservationStatus(@RequestParam Long reservationId, @RequestParam String status) {
        HttpHeaders httpHeaders = new HttpHeaders();
        Long statusOk = reservationService.updateReservationStatus(reservationId,status);
        return new ResponseEntity<Long>(statusOk, httpHeaders, HttpStatus.OK);
    }

}
