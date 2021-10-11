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

    String sentence2 = "Paranoids are not paranoid because they are paranoid but" +
            "because they keep putting themselves deliberately into paranoid avoidable situations";
    String b[] = sentence2.toLowerCase().split(" ");
    Map<String,Integer> words2 = new HashMap<>();
    for (String word : b) {
        if (words2.containsKey(word)) {
            words2.put(word,1 + words2.get(word));
        } else {
            words2.put(word,1);
        }
    } System.out.println(words2);
    }
}