package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.dto.ReservationTime;
import com.ldu.reservationOrder.dto.Restaurant;
import com.ldu.reservationOrder.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/res/showList")
    public String resShowList(Model model) {
        List<Restaurant> allRestaurant = boardService.findAllRestaurant();
        model.addAttribute("list", allRestaurant);
        return "board/resShowList";
    }

    @GetMapping("/res/restaurantStatus")
    public String restaurantStatus(Model model, @RequestParam Map<String, Object> params) {
        Restaurant restaurant = boardService.restaurantStatus((String) params.get("id"));
        model.addAttribute("restaurant", restaurant);
        return "board/resStatus";
    }

    @GetMapping("/res/showReservation")
    public String showReservation(Model model, @RequestParam Map<String, Object> params) {
        ReservationTime reservationTime = boardService.showReservation((String) params.get("res_id"));
        model.addAttribute("timeTable", reservationTime);
        return "board/resShowReservation";
    }

    @PostMapping("/res/reservation")
//    @PreAuthorize("hasRole('CUSTOMER')")
    public void reservation(Model model, @RequestParam Map<String, Object> params) {
        System.out.println(params.get("username"));
//        return "home";
    }
}
