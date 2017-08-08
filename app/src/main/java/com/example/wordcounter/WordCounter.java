package com.example.wordcounter;

/**
 * Created by stuartmoir on 08/08/2017.
 */

public class WordCounter {

    // Instance variables.
    int numWords;

    // Constructor
    public WordCounter(){
        this.numWords = numWords;
    }

    // Methods

    // Method adapted from http://bit.ly/2vM3PB4.
    public int countWords(String text){
        // Remove leading and trailing spaces, and duplicate spaces between words.
        String trimmedText = text.trim();
        // Handle empty strings.
        int numWords = trimmedText.isEmpty() ? 0 : trimmedText.split("\\s+").length;
        return numWords;
    }
}
