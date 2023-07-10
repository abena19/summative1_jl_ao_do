package com.company.Summative1LopesJoshua.controllers;

import com.company.Summative1LopesJoshua.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@RestController
public class QuoteController {

    private static final List<Quote> quotes = new ArrayList<>(Arrays.asList(
            new Quote(1, "Suzanne Collins", "May the odds be ever in your favor."),
            new Quote(2, "Suzanne Collins", "Hope is the only thing stronger than fear."),
            new Quote(3, "Suzanne Collins", "Fire is catching! And if we burn, you burn with us!"),
            new Quote(4, "Suzanne Collins", "It takes ten times as long to put yourself back together as it does to fall apart."),
            new Quote(5, "Suzanne Collins", "Destroying things is much easier than making them."),
            new Quote(6, "Suzanne Collins", "Here's some advice. Stay alive."),
            new Quote(7, "Suzanne Collins", "Remember, we're madly in love, so it's all right to kiss me anytime you feel like it."),
            new Quote(8, "Suzanne Collins", "You don't forget the face of the person who was your last hope."),
            new Quote(9, "Suzanne Collins", "I am not pretty. I am not beautiful. I am as radiant as the sun."),
            new Quote(10, "Suzanne Collins", "Stupid people are dangerous."),
            new Quote(11, "Veronica Roth", "We believe in ordinary acts of bravery, in the courage that drives one person to stand up for another."),
            new Quote(12, "Veronica Roth", "Becoming fearless isn't the point. That's impossible. It's learning how to control your fear, and how to be free from it."),
            new Quote(13, "Veronica Roth", "Sometimes crying or laughing are the only options left, and laughing feels better right now."),
            new Quote(14, "Veronica Roth", "I suppose a fire that burns that bright is not meant to last."),
            new Quote(15, "Veronica Roth", "I might be in love with you. I'm waiting until I'm sure to tell you, though."),
            new Quote(16, "Veronica Roth", "Fear doesn't shut you down; it wakes you up."),
            new Quote(17, "Veronica Roth", "Can I be forgiven for all I've done to get here? I want to be."),
            new Quote(18, "Veronica Roth", "Politeness is deception in pretty packaging."),
            new Quote(19, "Veronica Roth", "Human reason can excuse any evil; that is why it's so important that we don't rely on it."),
            new Quote(20, "Veronica Roth", "I am selfish. I am brave."),
            new Quote(21, "Stephenie Meyer", "I like the night. Without the dark, we'd never see the stars."),
            new Quote(22, "Stephenie Meyer", "I decided as long as I'm going to hell, I might as well do it thoroughly."),
            new Quote(23, "Stephenie Meyer", "I promise to love you forever, every single day of forever."),
            new Quote(24, "Stephenie Meyer", "When you can live forever, what do you live for?"),
            new Quote(25, "Stephenie Meyer", "Death is peaceful, easy. Life is harder.")
            // Add more quotes as per your requirement
    ));


    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote() {
        Random rand = new Random();
        return quotes.get(rand.nextInt(quotes.size()));
    }
}
