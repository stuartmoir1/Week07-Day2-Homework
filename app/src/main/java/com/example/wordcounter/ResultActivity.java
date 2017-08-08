package com.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // For layout 'item' return object based on item ID.
        TextView resultText = (TextView)findViewById(R.id.result_text);

        // Intent
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");

        resultText.setText(result);
    }
}
