package com.example.wordcounter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stuartmoir on 08/08/2017.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Test
    public void testGetWordCount(){
        wordCounter = new WordCounter();
        String words = "The quick brown fox jumps over the lazy dog";
        assertEquals(9, wordCounter.countWords(words));
    }
}
