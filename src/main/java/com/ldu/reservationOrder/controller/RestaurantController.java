package com.ldu.reservationOrder.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldu.reservationOrder.dto.*;
import com.ldu.reservationOrder.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public ResponseEntity<PageInfo> getRestaurantLists(@RequestParam(defaultValue = "1") Integer pageNum,
                                                       @RequestParam(defaultValue = "8") Integer pageSize) {
        HttpHeaders httpHeaders = new HttpHeaders();
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<RestaurantDto> restaurantDtoPageInfo = PageInfo.of(restaurantService.getRestaurantLists());
        return new ResponseEntity<PageInfo>(restaurantDtoPageInfo, httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/searchRestaurants")
    public ResponseEntity<PageInfo> getSearchRestaurantLists(@RequestParam(defaultValue = "1") Integer pageNum,
                                                             @RequestParam(defaultValue = "8") Integer pageSize,
                                                             RestaurantSerchDto restaurantSerchDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<RestaurantDto> restaurantDtoPageInfo = PageInfo.of( restaurantService.getSearchRestaurantLists(restaurantSerchDto));
        return new ResponseEntity<PageInfo>(restaurantDtoPageInfo, httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/restaurantDetail/{id}")
    public ResponseEntity<RestaurantDetailDto> getRestaurantDetail(@PathVariable Long id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        RestaurantDetailDto restaurantDetailDto = restaurantService.getRestaurantDetail(id);
        return new ResponseEntity<RestaurantDetailDto>(restaurantDetailDto, httpHeaders, HttpStatus.OK);
    }

    @PostMapping("/restaurants")
    public ResponseEntity<Long> registerRestaurant(@RequestBody RestaurantDto restaurantDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        Long restaurantId = restaurantService.registerRestaurant(restaurantDto);
        return new ResponseEntity<Long>(restaurantId, httpHeaders, HttpStatus.OK);
    }

    @PostMapping("/goal")
    public ResponseEntity<Long> registerGoal(@RequestBody GoalDto goalDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        Long goalId = restaurantService.registerGoal(goalDto);
        return new ResponseEntity<Long>(goalId, httpHeaders, HttpStatus.OK);
    }

    @PostMapping("/menu")
    public ResponseEntity<?> registerMenu(@RequestBody MenuListDto menuListDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        restaurantService.registerMenu(menuListDto);
        return new ResponseEntity<>(1, httpHeaders, HttpStatus.OK);
    }
}
