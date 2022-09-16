package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.dto.ReservationDto;
import com.ldu.reservationOrder.dto.UpdatePasswordDto;
import com.ldu.reservationOrder.dto.UserDto;
import com.ldu.reservationOrder.entity.ResUser;
import com.ldu.reservationOrder.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/userInfo/{userId}")
    public ResponseEntity<ResUser> userInfo(@PathVariable Long userId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        ResUser userInfo = memberService.userInfo(userId);
        return new ResponseEntity<ResUser>(userInfo, httpHeaders, HttpStatus.OK);
    }

    @PutMapping("/password")
    public void updatePassword(@RequestBody UpdatePasswordDto updatePasswordDto) {
        memberService.updatePassword(updatePasswordDto);
    }

    @PostMapping("/user")
    public ResponseEntity<Long> registerUser(@RequestBody UserDto userDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        Long registerUserId = memberService.registerUser(userDto);
        return new ResponseEntity<Long>(registerUserId, httpHeaders, HttpStatus.OK);
    }

}
