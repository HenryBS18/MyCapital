package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ROE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roe);

        //Declare Button
        EditText inputIncomeRoe, inputAssetRoe;
        Button HitungButtonRoe, roeBackButton;
        TextView HasilHitungTextRoe;


        //ID
        inputIncomeRoe = (EditText) findViewById(R.id.inputIncomeRoe);
        inputAssetRoe = (EditText) findViewById(R.id.inputEquityRoe);
        HitungButtonRoe = (Button) findViewById(R.id.HitungButtonRoe);
        roeBackButton = (Button) findViewById(R.id.roeBackButton);
        HasilHitungTextRoe = (TextView) findViewById(R.id.HasilHitungTextRoe);


        //Hasil
        HitungButtonRoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double NetIncome, Equity, ROE;
                int p = 100;

                NetIncome = Double.valueOf(inputIncomeRoe.getText().toString().trim());
                Equity = Double.valueOf(inputAssetRoe.getText().toString().trim());
                ROE = (NetIncome/Equity)*p;

                DecimalFormat dform = new DecimalFormat("#.##");
                String hasil = dform.format(ROE);
                HasilHitungTextRoe.setText(hasil + "%");

                Toast.makeText(getApplicationContext(),"Selesai Hitung",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Back Button
        roeBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ROE.this, Fundamental_Page.class);
                startActivity(intent);
            }
        });
    }
}