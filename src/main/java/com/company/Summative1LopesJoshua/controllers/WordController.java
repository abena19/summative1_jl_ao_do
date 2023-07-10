package com.company.Summative1LopesJoshua.controllers;

import com.company.Summative1LopesJoshua.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordController {
    private List<Definition> dictionary;
    private static int idCounter = 1;
    public WordController(){
        dictionary = new ArrayList<>();
        dictionary.add(new Definition(idCounter++, "Atrocity", "An extremely wicked or cruel act, typically one involving physical violence or injury."));
        dictionary.add(new Definition(idCounter++, "Benevolent", "Well meaning and kindly."));
        dictionary.add(new Definition(idCounter++, "Cacophony", "A harsh, discordant mixture of sounds."));
        dictionary.add(new Definition(idCounter++, "Debacle", "A sudden and ignominious failure; a fiasco."));
        dictionary.add(new Definition(idCounter++, "Egregious", "Outstandingly bad; shocking."));
        dictionary.add(new Definition(idCounter++, "Feral", "In a wild state, especially after escape from captivity or domestication."));
        dictionary.add(new Definition(idCounter++, "Gregarious", "Fond of company; sociable."));
        dictionary.add(new Definition(idCounter++, "Hapless", "Unfortunate."));
        dictionary.add(new Definition(idCounter++, "Innocuous", "Not harmful or offensive."));
        dictionary.add(new Definition(idCounter++, "Juxtaposition", "The fact of two things being seen or placed close together with contrasting effect."));
        dictionary.add(new Definition(idCounter++, "Kismet", "Destiny; fate."));
        dictionary.add(new Definition(idCounter++, "Languish", "Grow weak or feeble."));
        dictionary.add(new Definition(idCounter++, "Mundane", "Lacking interest or excitement; dull."));
        dictionary.add(new Definition(idCounter++, "Nefarious", "(typically of an action or activity) wicked or criminal."));
        dictionary.add(new Definition(idCounter++, "Ostentatious", "Characterized by vulgar or pretentious display; designed to impress or attract notice."));
        dictionary.add(new Definition(idCounter++, "Pernicious", "Having a harmful effect, especially in a gradual or subtle way."));


    }


    @RequestMapping(value = "/word" , method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Definition returnRandomWordandDef(){
        Definition randomDef = new Definition();
        randomDef.setId(idCounter++);
        randomDef.setWord(dictionary.get((int)(Math.random() * dictionary.size())).getWord());
        randomDef.setDefinition(dictionary.get((int) (Math.random() * dictionary.size())).getDefinition());
        return randomDef;
    }
}
