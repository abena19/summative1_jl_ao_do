package com.company.Summative1LopesJoshua.controller;

import com.company.Summative1LopesJoshua.controllers.Magic8BallController;
import com.company.Summative1LopesJoshua.controllers.WordController;
import com.company.Summative1LopesJoshua.models.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WordController.class)
public class WordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnRandomDefintion() throws Exception {
        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}
