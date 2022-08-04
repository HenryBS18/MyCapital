package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PBV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbv);

        //Declare Button
        EditText inputMarketCap, inputEquity;
        Button HitungButtonPbv, pbvBackButton;
        TextView HasilHitungTextPbv;


        //ID
        inputMarketCap = (EditText) findViewById(R.id.inputMarketCap);
        inputEquity = (EditText) findViewById(R.id.inputEquity);
        HitungButtonPbv = (Button) findViewById(R.id.HitungButtonPbv);
        pbvBackButton = (Button) findViewById(R.id.pbvBackButton);
        HasilHitungTextPbv = (TextView) findViewById(R.id.HasilHitungTextPbv);

        //Hasil
        HitungButtonPbv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double MarketCap, Equity, PBV;

                MarketCap = Double.valueOf(inputMarketCap.getText().toString().trim());
                Equity = Double.valueOf(inputEquity.getText().toString().trim());
                PBV = MarketCap/Equity;

                String hasil = String.valueOf(PBV);
                HasilHitungTextPbv.setText(hasil + "x");

                Toast.makeText(getApplicationContext(),"Selesai Hitung",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Back Button
        pbvBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PBV.this, Fundamental.class);
                startActivity(intent);

            }
        });
    }
}