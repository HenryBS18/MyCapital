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

public class Average_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average_page);

        //Declare
        EditText Lot1, Lot2, Lot3, Lot4, Lot5;
        EditText Price1, Price2, Price3, Price4, Price5;
        Button hitungButtonAverage, averageBackButton;
        TextView hasilHitungTextAverage;

        //ID
        Lot1 = (EditText) findViewById(R.id.Lot1);
        Lot2 = (EditText) findViewById(R.id.Lot2);
        Lot3 = (EditText) findViewById(R.id.Lot3);
        Lot4 = (EditText) findViewById(R.id.Lot4);
        Lot5 = (EditText) findViewById(R.id.Lot5);

        Price1 = (EditText) findViewById(R.id.Price1);
        Price2 = (EditText) findViewById(R.id.Price2);
        Price3 = (EditText) findViewById(R.id.Price3);
        Price4 = (EditText) findViewById(R.id.Price4);
        Price5 = (EditText) findViewById(R.id.Price5);

        hitungButtonAverage = (Button) findViewById(R.id.hitungButtonAverage);
        averageBackButton = (Button) findViewById(R.id.averageBackButton);

        hasilHitungTextAverage = (TextView) findViewById(R.id.hasilHitungTextAverage);


        //Hasil
        hitungButtonAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Avg;
                int lot1, lot2, lot3, lot4, lot5;
                int price1, price2, price3, price4, price5;

                lot1 = Integer.valueOf(Lot1.getText().toString().trim());
                lot2 = Integer.valueOf(Lot2.getText().toString().trim());
                lot3 = Integer.valueOf(Lot3.getText().toString().trim());
                lot4 = Integer.valueOf(Lot4.getText().toString().trim());
                lot5 = Integer.valueOf(Lot5.getText().toString().trim());

                price1 = Integer.valueOf(Price1.getText().toString().trim());
                price2 = Integer.valueOf(Price2.getText().toString().trim());
                price3 = Integer.valueOf(Price3.getText().toString().trim());
                price4 = Integer.valueOf(Price4.getText().toString().trim());
                price5 = Integer.valueOf(Price5.getText().toString().trim());

                Avg = ((lot1*price1)+(lot2*price2)+(lot3*price3)+(lot4*price4)+(lot5*price5))/(lot1+lot2+lot3+lot4+lot5);

                String Average = String.valueOf(Avg);
                hasilHitungTextAverage.setText(Average);

                Toast.makeText(getApplicationContext(),"Selesai Hitung",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Back Button
        averageBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Average_Page.this, MainActivity_Page.class);
                startActivity(intent);
            }
        });
    }
}