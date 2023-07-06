package com.company.Summative1LopesJoshua.controllers;

import com.company.Summative1LopesJoshua.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Magic8BallController {

    private List<Answer> answerList;

    private static int idCounter = 1;

    public Magic8BallController() {
        answerList = new ArrayList<>();
        answerList.add(new Answer(idCounter++, "It is certain", ""));
        answerList.add(new Answer(idCounter++, "probably", ""));
        answerList.add(new Answer(idCounter++, "Uncertain", ""));
        answerList.add(new Answer(idCounter++, "The answer is atleast 1", ""));
        answerList.add(new Answer(idCounter++, "Negative", ""));
        answerList.add(new Answer(idCounter++, "Yes", ""));
        answerList.add(new Answer(idCounter++, "No", ""));
        answerList.add(new Answer(idCounter++, "Maybe", ""));
        answerList.add(new Answer(idCounter++, "Ask again later", ""));
        answerList.add(new Answer(idCounter++, "I don't know", ""));
        answerList.add(new Answer(idCounter++, "Affirmative", ""));
    }


    @RequestMapping(value = "/magic", method = RequestMethod.GET)
    public List<Answer> getAnswerList(){

        return answerList;
    }
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Answer createResponseAnswer(@RequestBody Answer question){
        Answer newQuestion = new Answer();
        newQuestion.setId(idCounter++);
        newQuestion.setQuestion(question.getQuestion());
        newQuestion.setAnswer(answerList.get((int) (Math.random() * answerList.size())).getAnswer());//this line is the randomizer
        //it setss newQuestion's answer to a random answer from the list
        //.get methos gets passed in an index
        answerList.add(newQuestion);

        return newQuestion;
    }


}
