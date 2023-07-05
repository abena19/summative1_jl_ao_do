package com.company.Summative1LopesJoshua.services;

import com.company.Summative1LopesJoshua.models.Quote;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    private final RestTemplate restTemplate;
    private List<Quote> currentQuotes;

    public QuoteService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void fetchQuote() {
        this.currentQuotes = this.restTemplate.getForObject("https://api.theysaidso.com/qod.json", List.class);
        System.out.println(this.currentQuotes);
    }
    
    public Quote getRandomQuote() {
        // if the date has changed since the last fetch, fetch the quotes again
        fetchQuote();
        if(currentQuotes.isEmpty()){
            return null;  // if no quotes were fetched
        }
        // pick a random quote from the list
        Random rand = new Random();
        return currentQuotes.get(rand.nextInt(currentQuotes.size()));
    }
}
