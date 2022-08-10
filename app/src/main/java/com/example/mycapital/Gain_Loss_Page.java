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

public class Gain_Loss_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_loss_page);

        //Declare Button
        EditText inputLot, inputBuy, inputLastPrice;
        Button HitungButtonGainLoss, gainlossBackButton;
        TextView HasilHitungTextGainLoss, PercentText;


        //ID
        inputLot = (EditText) findViewById(R.id.inputLot);
        inputBuy = (EditText) findViewById(R.id.inputBuy);
        inputLastPrice = (EditText) findViewById(R.id.inputLastPrice);
        HitungButtonGainLoss = (Button) findViewById(R.id.HitungButtonGainLoss);
        gainlossBackButton = (Button) findViewById(R.id.gainlossBackButton);
        HasilHitungTextGainLoss = (TextView) findViewById(R.id.HasilHitungTextGainLoss);
        PercentText = (TextView) findViewById(R.id.PercentText);

        //Hasil
        HitungButtonGainLoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Lot, AvgBuy, LastPrice, Gain_Loss, Percent;
                int p = 100;

                Lot = Double.valueOf(inputLot.getText().toString().trim());
                AvgBuy = Double.valueOf(inputBuy.getText().toString().trim());
                LastPrice = Double.valueOf(inputLastPrice.getText().toString().trim());

                Gain_Loss = ((LastPrice-AvgBuy)/AvgBuy)*AvgBuy*Lot*p;
                Percent = ((LastPrice-AvgBuy)/AvgBuy)*p;

                String hasil = String.valueOf(String.format("%,.0f", Gain_Loss));
                HasilHitungTextGainLoss.setText("Rp." + hasil);

                DecimalFormat dform = new DecimalFormat("#.##");
                String hasil2 = dform.format(Percent);
                PercentText.setText(hasil2 + "%");

                Toast.makeText(getApplicationContext(),hasil2 + "%" +"Selesai Hitung",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Back Button
        gainlossBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gain_Loss_Page.this, MainActivity_Page.class);
                startActivity(intent);
            }
        });
    }
}