package com.ldu.reservationOrder.controller;

import com.ldu.reservationOrder.dto.Restaurant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class BoardControllerTest {

    @Autowired
    private BoardController boardController;

    private MockMvc mockMvc;

    @BeforeEach
    public void beforeEach() {
        mockMvc = MockMvcBuilders.standaloneSetup(boardController).build();
    }

    @Test
    void 음식점리스트전체조회() {
        MockHttpServletRequestBuilder builder = get("/res/showlist");
        try {
            mockMvc.perform(builder).andExpect(view().name("board/resShowList"))
                    .andExpect(status().is(200));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void 음식점상세보기() {
        MockHttpServletRequestBuilder builder = get("/res/restaurantStatus")
                .param("id","3");
        try {
            mockMvc.perform(builder).andExpect(view().name("board/resStatus"))
                    .andExpect(status().is(200))
                    // 컨트롤러에 id값 전달하는 코드 생성하여 테스트
                    .andExpect(model().attribute("resId", "3"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
