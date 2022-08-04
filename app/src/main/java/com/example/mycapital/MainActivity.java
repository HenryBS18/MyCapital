package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare Button
        Button FundamentalButton, GainLossButton, IpoButton, AverageButton, TradingPlanButton;


        //ID
        FundamentalButton = findViewById(R.id.FundamentalButton);
        GainLossButton = findViewById(R.id.GainLossButton);
        IpoButton = findViewById(R.id.IpoButton);
        AverageButton = findViewById(R.id.AverageButton);
        TradingPlanButton = findViewById(R.id.TradingPlanButton);


        //Switch Button
        FundamentalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Fundamental.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Fundamental Calculator",
                        Toast.LENGTH_SHORT).show();

            }
        });

        GainLossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Gain_Loss.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Gain/Loss Calculator",
                        Toast.LENGTH_SHORT).show();

            }
        });










    }}
