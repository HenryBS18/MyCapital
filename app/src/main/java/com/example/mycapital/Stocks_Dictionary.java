package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stocks_Dictionary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks_dictionary);

        //Declare
        Button dictionaryBackButton;

        //ID
        dictionaryBackButton = (Button) findViewById(R.id.dictionaryBackButton);

        //Back button
        dictionaryBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Stocks_Dictionary.this, MainActivity_Page.class);
                startActivity(intent);
            }
        });


    }
}