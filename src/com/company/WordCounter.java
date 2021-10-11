package com.company;

import java.util.*;

public class WordCounter {

    static void remove(String str, String removeWord) {
        String msg[] = str.split(" ");
        String new_str = " ";
        for (String words : msg) {
            if (!words.equals(removeWord)) {
                new_str += words + " ";
            }
        }
        System.out.println();
        System.out.println("Removed the word -> avoidable");
        System.out.println(new_str);
    }


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
        Map<String, Integer> words2 = new HashMap<>();
        for (String word : b) {
            if (words2.containsKey(word)) {
                words2.put(word, 1 + words2.get(word));
            } else {
                words2.put(word, 1);
            }
        }
        System.out.println(words2);

        String str = "Paranoids are not paranoid because they are paranoid but" +
                "because they keep putting themselves deliberately into paranoid avoidable situations";
        String removeWord = "avoidable";
        remove(str, removeWord);
    }
}