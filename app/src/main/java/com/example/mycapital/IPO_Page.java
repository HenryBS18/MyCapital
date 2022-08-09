package com.example.mycapital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IPO_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipo_page);

        //Declare Button
        EditText inputIpoLot, inputPercentage, inputIpoPrice;
        Button hitungButtonIPO, ipoBackButton;
        TextView TotalLotText, MarketCapText, hasilHitungTextIPO;

        //ID
        inputIpoLot = (EditText) findViewById(R.id.inputIpoLot);
        inputPercentage = (EditText) findViewById(R.id.inputPercentage);
        inputIpoPrice = (EditText) findViewById(R.id.inputIpoPrice);
        hitungButtonIPO = (Button) findViewById(R.id.hitungButtonIPO);
        ipoBackButton = (Button) findViewById(R.id.ipoBackButton);
        TotalLotText = (TextView) findViewById(R.id.TotalLotText);
        MarketCapText = (TextView) findViewById(R.id.MarketCapText);
        hasilHitungTextIPO = (TextView) findViewById(R.id.hasilHitungTextIPO);

        //Hasil
        hitungButtonIPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double ipoPercentage;
                double ipoLot, ipoPrice, totalLot, marketCap, Percent = 100;

                ipoLot = Double.valueOf(inputIpoLot.getText().toString().trim());
                ipoPrice = Double.valueOf(inputIpoPrice.getText().toString().trim());
                ipoPercentage = Double.valueOf(inputPercentage.getText().toString().trim());

                totalLot = ((ipoLot*Percent)/ipoPercentage);
                marketCap = totalLot*ipoPrice*Percent;

                String TotalLot = String.valueOf(totalLot);
                TotalLotText.setText(TotalLot);

                String MarketCap = String.valueOf(marketCap);
                MarketCapText.setText(MarketCap);

                hasilHitungTextIPO.setText(" ");

                Toast.makeText(getApplicationContext(),"Selesai Hitung",
                        Toast.LENGTH_SHORT).show();

            }
        });

        //Back Button
        ipoBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IPO_Page.this, MainActivity_Page.class);
                startActivity(intent);
            }
        });
















    }
}