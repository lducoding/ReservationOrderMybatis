package com.ldu.reservationOrder.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

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


}
