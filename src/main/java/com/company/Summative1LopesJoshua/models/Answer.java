package com.company.Summative1LopesJoshua.models;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer {
    private int id;
    private String question;
    private String answer;

    public Answer() {
    }
    public Answer(int id, String answer, String question) {
        this.id = id;
        this.answer = answer;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
