package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        inputIncomeRoe = (EditText) findViewById(R.id.inputIncome);
        inputAssetRoe = (EditText) findViewById(R.id.inputAsset);
        HitungButtonRoe = (Button) findViewById(R.id.HitungButtonRoa);
        roeBackButton = (Button) findViewById(R.id.roaBackButton);
        HasilHitungTextRoe = (TextView) findViewById(R.id.HasilHitungTextRoa);


        //Hasil
        HitungButtonRoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double NetIncome, Equity, ROE;
                int p = 100;

                NetIncome = Double.valueOf(inputIncomeRoe.getText().toString().trim());
                Equity = Double.valueOf(inputAssetRoe.getText().toString().trim());
                ROE = (NetIncome/Equity)*p;

                String hasil = String.valueOf(ROE);
                HasilHitungTextRoe.setText(hasil + "%");

                Toast.makeText(getApplicationContext(),"Selesai Hitung",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Back Button
        roeBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ROE.this, Fundamental.class);
                startActivity(intent);
            }
        });
    }
}