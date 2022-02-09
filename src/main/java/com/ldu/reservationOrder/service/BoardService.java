package com.ldu.reservationOrder.service;

import com.ldu.reservationOrder.dto.Restaurant;
import com.ldu.reservationOrder.mapper.BoardMapper;
import com.ldu.reservationOrder.repository.BoardRepository;
import com.ldu.reservationOrder.repository.MemoryBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
