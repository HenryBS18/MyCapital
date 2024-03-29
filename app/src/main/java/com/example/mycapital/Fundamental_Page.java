package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Fundamental_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundamental_page);

        //Declare Button
        Button perButton, pbvButton, roaButton, roeButton, derButton,FundaBackButton;

        //ID
        perButton = (Button) findViewById(R.id.perButton);
        pbvButton = (Button) findViewById(R.id.pbvButton);
        roaButton = (Button) findViewById(R.id.roaButton);
        roeButton = (Button) findViewById(R.id.roeButton);
        derButton = (Button) findViewById(R.id.derButton);
        FundaBackButton = (Button) findViewById(R.id.FundaBackButton);

        //Switch Page & Popup Text
        perButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fundamental_Page.this, PER.class);
                startActivity(intent);

                Toast.makeText(getApplication(), "PER",
                        Toast.LENGTH_SHORT).show();
            }
        });

        pbvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fundamental_Page.this, PBV.class);
                startActivity(intent);

                Toast.makeText(getApplication(), "PBV",
                        Toast.LENGTH_SHORT).show();
            }
        });

        roaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fundamental_Page.this, ROA.class);
                startActivity(intent);

                Toast.makeText(getApplication(), "ROA",
                        Toast.LENGTH_SHORT).show();
            }
        });

        roeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fundamental_Page.this, ROE.class);
                startActivity(intent);

                Toast.makeText(getApplication(), "ROE",
                        Toast.LENGTH_SHORT).show();
            }
        });

        derButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fundamental_Page.this, DER.class);
                startActivity(intent);

                Toast.makeText(getApplication(), "DER",
                        Toast.LENGTH_SHORT).show();
            }
        });

        FundaBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fundamental_Page.this, MainActivity_Page.class);
                startActivity(intent);

            }
        });
    }}



















