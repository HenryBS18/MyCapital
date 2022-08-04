package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_der);

        //Declare Button
        EditText inputLiabilities, inputEquityDer;
        Button HitungButtonDer, derBackButton;
        TextView HasilHitungTextDer;


        //ID
        inputLiabilities = (EditText) findViewById(R.id.inputLiabilities);
        inputEquityDer = (EditText) findViewById(R.id.inputEquityDer);
        HitungButtonDer = (Button) findViewById(R.id.HitungButtonDer);
        derBackButton = (Button) findViewById(R.id.derBackButton);
        HasilHitungTextDer = (TextView) findViewById(R.id.HasilHitungTextDer);


        //Hasil
        HitungButtonDer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Liabilities, Equity, DER;
                int p = 100;

                Liabilities = Double.valueOf(inputLiabilities.getText().toString().trim());
                Equity = Double.valueOf(inputEquityDer.getText().toString().trim());
                DER = (Liabilities/Equity)*p;

                String hasil = String.valueOf(DER);
                HasilHitungTextDer.setText(hasil + "%");

                Toast.makeText(getApplicationContext(),"Selesai Hitung",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Back Button
        derBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DER.this, Fundamental.class);
                startActivity(intent);
            }
        });
    }
}