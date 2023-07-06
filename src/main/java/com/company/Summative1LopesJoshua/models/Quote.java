package com.company.Summative1LopesJoshua.models;

public class Quote {
    private int id;
    private String author;
    private String quote;

    public Quote() {}

    public Quote(int id, String author, String quote) {
        this.author = author;
        this.quote = quote;
        this.id = id;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id.intValue();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

}
