package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSecondActivity(View view) {
        EditText eText = (EditText) findViewById(R.id.inputText); //define and initialize input field
        String username = eText.getText().toString(); //Convert edittext into string
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class); //Create intent
        intent.putExtra("name", username); //now by putExtra method put the value in key, value
        startActivity(intent); //Start the intent
    }
}