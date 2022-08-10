package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Dictionary;

public class MainActivity_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        //Declare Button
        Button FundamentalButton, GainLossButton, IpoButton, AverageButton, DictionaryButton;


        //ID
        FundamentalButton = findViewById(R.id.FundamentalButton);
        GainLossButton = findViewById(R.id.GainLossButton);
        IpoButton = findViewById(R.id.IpoButton);
        AverageButton = findViewById(R.id.AverageButton);
        DictionaryButton = findViewById(R.id.DictionaryButton);


        //Switch Button
        FundamentalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_Page.this, Fundamental_Page.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Fundamental Calculator",
                        Toast.LENGTH_SHORT).show();

            }
        });

        GainLossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_Page.this, Gain_Loss_Page.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Gain/Loss Calculator",
                        Toast.LENGTH_SHORT).show();

            }
        });

        IpoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_Page.this, IPO_Page.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "IPO Calculator",
                        Toast.LENGTH_SHORT).show();
            }
        });

        AverageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_Page.this, Average_Page.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Average Calculator",
                        Toast.LENGTH_SHORT).show();
            }
        });

        DictionaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_Page.this, Stocks_Dictionary.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "DICTIONARY",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }}
