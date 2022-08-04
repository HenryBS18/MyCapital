package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ROA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roa);

        //Declare Button
        EditText inputIncome, inputAsset;
        Button HitungButtonRoa, roaBackButton;
        TextView HasilHitungTextRoa;


        //ID
        inputIncome = (EditText) findViewById(R.id.inputIncome);
        inputAsset = (EditText) findViewById(R.id.inputAsset);
        HitungButtonRoa = (Button) findViewById(R.id.HitungButtonRoa);
        roaBackButton = (Button) findViewById(R.id.roaBackButton);
        HasilHitungTextRoa = (TextView) findViewById(R.id.HasilHitungTextRoa);


        //Hasil
        HitungButtonRoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double NetIncome, Asset, ROA;
                int p = 100;

                NetIncome = Double.valueOf(inputIncome.getText().toString().trim());
                Asset = Double.valueOf(inputAsset.getText().toString().trim());
                ROA = (NetIncome/Asset)*p;

                String hasil = String.valueOf(ROA);
                HasilHitungTextRoa.setText(hasil + "%");

                Toast.makeText(getApplicationContext(),"Selesai Hitung",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Back Button
        roaBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ROA.this, Fundamental.class);
                startActivity(intent);
            }
        });
    }
}