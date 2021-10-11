package com.company;

import java.util.*;

public class WordCounter {

    public static void main(String[] args) {

        String sentence = "To be or not to be";
        String a[] = sentence.toLowerCase().split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String word : a) {
            if (words.containsKey(word)) {
                words.put(word, 1 + words.get(word));
            } else {
                words.put(word, 1);
            }
        }
        System.out.println(words);
    }
}