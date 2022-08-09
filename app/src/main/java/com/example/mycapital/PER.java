package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per);

        //Declare Button
        EditText inputPrice, inputEPS;
        Button HitungButton, perBackButton;
        TextView HasilHitungText;

        //ID
        inputPrice = (EditText) findViewById(R.id.inputPrice);
        inputEPS = (EditText) findViewById(R.id.inputEPS);
        HitungButton = (Button) findViewById(R.id.HitungButton);
        HasilHitungText = (TextView) findViewById(R.id.HasilHitungText);
        perBackButton = (Button) findViewById(R.id.perBackButton);

        //Hasil
        HitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Price, EPS, PER;

                Price = Double.valueOf(inputPrice.getText().toString().trim());
                EPS = Double.valueOf(inputEPS.getText().toString().trim());
                PER = Price/EPS;

                String hasil = String.valueOf(PER);
                HasilHitungText.setText(hasil + "x");

                Toast.makeText(getApplicationContext(),"Selesai Hitung",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Back Button
        perBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PER.this, Fundamental_Page.class);
                startActivity(intent);
            }
        });
    }
}