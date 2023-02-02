package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView outputText = (TextView) findViewById(R.id.outputText); //define var for show op
        Intent intent = getIntent(); //get intent
        String name = intent.getStringExtra("name"); //fetch data from intent
        outputText.setText(name); //Set text where we want to show it
    }
}