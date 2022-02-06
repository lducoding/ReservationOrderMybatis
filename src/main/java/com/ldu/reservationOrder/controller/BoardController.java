package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.dto.Restaurant;
import com.ldu.reservationOrder.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;


    @GetMapping("/res/showlist")
    public String resShowList(Model model) {
        List<Restaurant> allRestaurant = boardService.findAllRestaurant();
        model.addAttribute("list", allRestaurant.get(0));
        return "board/resShowList";
    }
}
