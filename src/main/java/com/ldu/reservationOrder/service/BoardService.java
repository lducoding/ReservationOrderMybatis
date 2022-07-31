package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.model.ReservationTime;
import com.ldu.reservationOrder.model.Restaurant;
import com.ldu.reservationOrder.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

//    @Autowired
//     private final BoardRepository boardRepository;

//    public BoardService(BoardRepository boardRepository) {
//        this.boardRepository = boardRepository;
//    }

    @Autowired
    private BoardMapper boardMapper;

    /**
     * 등록된 음식점 전체 조회
     */
    public List<Restaurant> findAllRestaurant() {
        return boardMapper.findAllRestaurant();
    }

    /**
     * 음식점 상세조회
     */
    public Restaurant restaurantStatus(String id) {
        return boardMapper.restaurantStatus(id);
    }

    /**
     * 음식점 예약 시간 별 현황
     */
    public ReservationTime showReservation(String resId) {
        return boardMapper.showReservation(resId);
    }

    /**
     * 음식점 메뉴 가져오기
     */
    public ArrayList<String> getResMenu(String resId) {
        return boardMapper.getResMenu(resId);
    }
}
