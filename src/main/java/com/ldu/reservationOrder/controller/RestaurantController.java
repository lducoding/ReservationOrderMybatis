package com.ldu.reservationOrder.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldu.reservationOrder.dto.RestaurantDto;
import com.ldu.reservationOrder.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public ResponseEntity<PageInfo> getRestaurantLists(HttpServletRequest req) {
        HttpHeaders httpHeaders = new HttpHeaders();
        List<RestaurantDto> restaurantLists = restaurantService.getRestaurantLists();
        PageHelper.startPage(req);
        PageInfo<RestaurantDto> pageingRestaurantLists = PageInfo.of(restaurantLists);
        return new ResponseEntity<PageInfo> (pageingRestaurantLists, httpHeaders, HttpStatus.OK);
    }
}
