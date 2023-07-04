package com.company.Summative1LopesJoshua.models;

public class Quote {
    private int id;
    private String author;
    private String quote;

    public Quote() {}

    public Quote(String author, String quote, int id) {
        this.author = author;
        this.quote = quote;
        this.id = id;
    }
}
