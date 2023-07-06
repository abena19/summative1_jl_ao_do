package com.company.Summative1LopesJoshua;

import com.company.Summative1LopesJoshua.models.Quote;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    private final List<Quote> quotes;

    public QuoteService() {
        quotes = new ArrayList<>();

        quotes.add(new Quote(1, "Suzanne Collins", "May the odds be ever in your favor."));
        quotes.add(new Quote(2, "Suzanne Collins", "Hope is the only thing stronger than fear."));
        quotes.add(new Quote(3, "Suzanne Collins", "Fire is catching! And if we burn, you burn with us!"));
        quotes.add(new Quote(4, "Suzanne Collins", "It takes ten times as long to put yourself back together as it does to fall apart."));
        quotes.add(new Quote(5, "Suzanne Collins", "Destroying things is much easier than making them."));
        quotes.add(new Quote(6, "Suzanne Collins", "Here's some advice. Stay alive."));
        quotes.add(new Quote(7, "Suzanne Collins", "Remember, we're madly in love, so it's all right to kiss me anytime you feel like it."));
        quotes.add(new Quote(8, "Suzanne Collins", "You don't forget the face of the person who was your last hope."));
        quotes.add(new Quote(9, "Suzanne Collins", "I am not pretty. I am not beautiful. I am as radiant as the sun."));
        quotes.add(new Quote(10, "Suzanne Collins", "Stupid people are dangerous."));
        quotes.add(new Quote(11, "Veronica Roth", "We believe in ordinary acts of bravery, in the courage that drives one person to stand up for another."));
        quotes.add(new Quote(12, "Veronica Roth", "Becoming fearless isn't the point. That's impossible. It's learning how to control your fear, and how to be free from it."));
        quotes.add(new Quote(13, "Veronica Roth", "Sometimes crying or laughing are the only options left, and laughing feels better right now."));
        quotes.add(new Quote(14, "Veronica Roth", "I suppose a fire that burns that bright is not meant to last."));
        quotes.add(new Quote(15, "Veronica Roth", "I might be in love with you. I'm waiting until I'm sure to tell you, though."));
        quotes.add(new Quote(16, "Veronica Roth", "Fear doesn't shut you down; it wakes you up."));
        quotes.add(new Quote(17, "Veronica Roth", "Can I be forgiven for all I've done to get here? I want to be."));
        quotes.add(new Quote(18, "Veronica Roth", "Politeness is deception in pretty packaging."));
        quotes.add(new Quote(19, "Veronica Roth", "Human reason can excuse any evil; that is why it's so important that we don't rely on it."));
        quotes.add(new Quote(20, "Veronica Roth", "I am selfish. I am brave."));
        quotes.add(new Quote(21, "Stephenie Meyer", "I like the night. Without the dark, we'd never see the stars."));
        quotes.add(new Quote(22, "Stephenie Meyer", "I decided as long as I'm going to hell, I might as well do it thoroughly."));
        quotes.add(new Quote(23, "Stephenie Meyer", "I promise to love you forever, every single day of forever."));
        quotes.add(new Quote(24, "Stephenie Meyer", "When you can live forever, what do you live for?"));
        quotes.add(new Quote(25, "Stephenie Meyer", "Death is peaceful, easy. Life is harder."));
        quotes.add(new Quote(26, "Stephenie Meyer", "I dream about being with you forever."));
        quotes.add(new Quote(27, "Stephenie Meyer", "I've always been very good at guessing people's weaknesses. Never seen anything like you, though."));
        quotes.add(new Quote(28, "Stephenie Meyer", "I was born to be a vampire."));
        quotes.add(new Quote(29, "Stephenie Meyer", "And so the lion fell in love with the lamb."));
        quotes.add(new Quote(30, "Stephenie Meyer", "It will be as if I'd never existed."));
        quotes.add(new Quote(31, "L.J. Smith", "Because when people see good, they expect good. And I don't want to have to live up to anyone's expectations."));
        quotes.add(new Quote(32, "L.J. Smith", "The smallest chance at the perfect life is better than no life at all."));
        quotes.add(new Quote(33, "L.J. Smith", "You are the woman that someone is longing for."));
        quotes.add(new Quote(34, "L.J. Smith", "Life is too precious to waste it with the wrong person. You're my life now."));
        quotes.add(new Quote(35, "L.J. Smith", "I wanted it to be real. Human."));
        quotes.add(new Quote(36, "L.J. Smith", "I won't let love disrupt, corrupt or interrupt me anymore."));
        quotes.add(new Quote(37, "L.J. Smith", "Sometimes you have to be a high-riding bitch to survive. Sometimes being a bitch is all a woman has to hold onto."));
        quotes.add(new Quote(38, "L.J. Smith", "Destiny can be changed, but you have to face it first."));
        quotes.add(new Quote(39, "L.J. Smith", "My love for you is a journey; starting at forever, ending at never."));
        quotes.add(new Quote(40, "L.J. Smith", "Love does not always do what is best for you."));
    }

    public Quote getRandomQuote() {
        Random rand = new Random();
        return quotes.get(rand.nextInt(quotes.size()));
    }
}
