package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class PER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per);

        //Declare Button
        EditText inputPrice, inputEPS;
        Button HitungButton;
        TextView HasilHitungText;

        //ID
        inputPrice = (EditText) findViewById(R.id.inputPrice);
        inputEPS = (EditText) findViewById(R.id.inputEPS);
        HitungButton = (Button) findViewById(R.id.HitungButton);
        HasilHitungText = (TextView) findViewById(R.id.HasilHitungText);


        //Hasil
        HitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Price, EPS, Hasil;

                Price = Double.valueOf(inputPrice.getText().toString().trim());
                EPS = Double.valueOf(inputEPS.getText().toString().trim());
                Hasil = Price/EPS;

                String hasil = String.valueOf(Hasil);
                HasilHitungText.setText(hasil + "x");
            }
        });
    }
}