package com.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCounterActivity extends AppCompatActivity {

    // Instance variables.
    EditText wordsEditText;
    Button button;

    // Initialise
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        // For each layout 'item' return object based on item ID.
        wordsEditText = (EditText)findViewById(R.id.words_text);
        button = (Button)findViewById(R.id.button);
    }

    // On button tap.
    public void onButtonClicked(View button){
        // Get words from object.
        String words = wordsEditText.getText().toString();
        // Get word count of words.
        WordCounter wordCounter = new WordCounter();
        Integer wordNum = wordCounter.countWords(words);
        // Convert word count to String to allow use by Intent (specifically Bundle).
        String result = wordNum.toString();

        Log.d(getClass().toString(), "The word count is: " + result.toString());

        // Intent
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
