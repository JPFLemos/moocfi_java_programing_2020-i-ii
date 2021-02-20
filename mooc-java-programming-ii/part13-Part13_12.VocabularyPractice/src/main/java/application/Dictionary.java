package application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joaop
 */
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Dictionary {

    private Map<String, String> translations;
    private List<String> words;

    public Dictionary() {
        this.translations = new HashMap<>();
        this.words = new ArrayList<>();
        
        addWord("traduzione", "parola");

    }

    public void addWord(String word, String translation) {
        if (!this.words.contains(word)) {
            this.words.add(word);

        }

        this.translations.put(word, translation);
    }

    public String get(String word) {
        return this.translations.get(word);
    }

    public String randomWord() {
        Random random = new Random();

        return this.words.get(random.nextInt(this.words.size()));
    }

}
