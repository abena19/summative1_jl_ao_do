package com.company.Summative1LopesJoshua.controller;

import com.company.Summative1LopesJoshua.controllers.Magic8BallController;
import com.company.Summative1LopesJoshua.models.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Magic8BallController.class)
public class Magic8BallControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnNewAnswerOnPostRequest() throws Exception {
        Answer inputQuestion = new Answer();
        inputQuestion.setQuestion("Will I pass this test?");

        String inputJson = mapper.writeValueAsString(inputQuestion);

        mockMvc.perform(post("/magic")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated());
    }

}
