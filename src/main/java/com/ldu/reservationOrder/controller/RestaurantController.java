package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.dto.RestaurantDto;
import com.ldu.reservationOrder.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public ResponseEntity<List<RestaurantDto>> getRestaurantLists() {
        HttpHeaders httpHeaders = new HttpHeaders();
        Optional<List<RestaurantDto>> restaurantLists = restaurantService.getRestaurantLists();

        return new ResponseEntity<List<RestaurantDto>>(restaurantLists.get(), httpHeaders, HttpStatus.OK);
    }
}
