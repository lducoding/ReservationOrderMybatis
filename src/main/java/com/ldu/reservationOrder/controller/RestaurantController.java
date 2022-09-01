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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public ResponseEntity<PageInfo> getRestaurantLists(@RequestParam(defaultValue = "1") Integer pageNum,
                                                       @RequestParam(defaultValue = "3") Integer pageSize) {
        HttpHeaders httpHeaders = new HttpHeaders();
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<RestaurantDto> restaurantDtoPageInfo = PageInfo.of(restaurantService.getRestaurantLists());

        return new ResponseEntity<PageInfo> (restaurantDtoPageInfo, httpHeaders, HttpStatus.OK);
    }
}
