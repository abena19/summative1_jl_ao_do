package com.company.Summative1LopesJoshua.controllers;

import com.company.Summative1LopesJoshua.QuoteService;
import com.company.Summative1LopesJoshua.models.Quote;
import com.company.Summative1LopesJoshua.QuoteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }


    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote() {
        return quoteService.getRandomQuote();
    }
}
