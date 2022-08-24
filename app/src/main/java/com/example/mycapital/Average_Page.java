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

import java.text.DecimalFormat;

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
                double lot1, lot2, lot3, lot4, lot5;
                double price1, price2, price3, price4, price5;

                lot1 = Double.valueOf(Lot1.getText().toString().trim());
                lot2 = Double.valueOf(Lot2.getText().toString().trim());
                lot3 = Double.valueOf(Lot3.getText().toString().trim());
                lot4 = Double.valueOf(Lot4.getText().toString().trim());
                lot5 = Double.valueOf(Lot5.getText().toString().trim());

                price1 = Double.valueOf(Price1.getText().toString().trim());
                price2 = Double.valueOf(Price2.getText().toString().trim());
                price3 = Double.valueOf(Price3.getText().toString().trim());
                price4 = Double.valueOf(Price4.getText().toString().trim());
                price5 = Double.valueOf(Price5.getText().toString().trim());

                Avg = ((lot1 * price1) + (lot2 * price2) + (lot3 * price3) + (lot4 * price4) + (lot5 * price5)) / (lot1 + lot2 + lot3 + lot4 + lot5);

                DecimalFormat dform = new DecimalFormat("#.##");
                String Average = dform.format(Avg);

                hasilHitungTextAverage.setText(Average);

//                //ifa
//                if (Lot5.getText().toString().equals(Lot5));
//
//                else if (Price5.getText().toString().equals(Price5));
//
//                else {
//                    lot1 = Double.valueOf(Lot1.getText().toString().trim());
//                    lot2 = Double.valueOf(Lot2.getText().toString().trim());
//                    lot3 = Double.valueOf(Lot3.getText().toString().trim());
//                    lot4 = Double.valueOf(Lot4.getText().toString().trim());
//                    lot5 = Double.valueOf(Lot5.getText().toString().trim());
//
//                    price1 = Double.valueOf(Price1.getText().toString().trim());
//                    price2 = Double.valueOf(Price2.getText().toString().trim());
//                    price3 = Double.valueOf(Price3.getText().toString().trim());
//                    price4 = Double.valueOf(Price4.getText().toString().trim());
//                    price5 = Double.valueOf(Price5.getText().toString().trim());
//
//                    Avg = ((lot1 * price1) + (lot2 * price2) + (lot3 * price3) + (lot4 * price4) + (lot5 * price5) / (lot1 + lot2 + lot3 + lot4 + lot5));
//
//                    DecimalFormat dform = new DecimalFormat("#.##");
//                    String Average = dform.format(Avg);
//                    hasilHitungTextAverage.setText(Average);
//                }
//
//                //if
//                if (Lot5.getText().toString().equals(Lot5));
//
//                else if (Price5.getText().toString().equals(""));
//
//                else {
//                    lot1 = Double.valueOf(Lot1.getText().toString().trim());
//                    lot2 = Double.valueOf(Lot2.getText().toString().trim());
//                    lot3 = Double.valueOf(Lot3.getText().toString().trim());
//                    lot4 = Double.valueOf(Lot4.getText().toString().trim());
//
//                    price1 = Double.valueOf(Price1.getText().toString().trim());
//                    price2 = Double.valueOf(Price2.getText().toString().trim());
//                    price3 = Double.valueOf(Price3.getText().toString().trim());
//                    price4 = Double.valueOf(Price4.getText().toString().trim());
//
//                    Avg = ((lot1 * price1) + (lot2 * price2) + (lot3 * price3) + (lot4 * price4) / (lot1 + lot2 + lot3 + lot4));
//
//                    DecimalFormat dform = new DecimalFormat("#.##");
//                    String Average = dform.format(Avg);
//                    hasilHitungTextAverage.setText(Average);
//                }
//
//                //if 2
//                if (Lot4.getText().toString().equals(""));
//
//                else if (Price4.getText().toString().equals(""));
//
//                else {
//                    lot1 = Double.valueOf(Lot1.getText().toString().trim());
//                    lot2 = Double.valueOf(Lot2.getText().toString().trim());
//                    lot3 = Double.valueOf(Lot3.getText().toString().trim());
//
//                    price1 = Double.valueOf(Price1.getText().toString().trim());
//                    price2 = Double.valueOf(Price2.getText().toString().trim());
//                    price3 = Double.valueOf(Price3.getText().toString().trim());
//
//                    Avg = ((lot1 * price1) + (lot2 * price2) + (lot3 * price3) / (lot1 + lot2 + lot3));
//
//                    DecimalFormat dform = new DecimalFormat("#.##");
//                    String Average = dform.format(Avg);
//                    hasilHitungTextAverage.setText(Average);
//                }
//
//                //if 3
//                if (Lot3.getText().toString().equals(""));
//
//                else if (Price3.getText().toString().equals(""));
//
//                else {
//                    lot1 = Double.valueOf(Lot1.getText().toString().trim());
//                    lot2 = Double.valueOf(Lot2.getText().toString().trim());
//
//                    price1 = Double.valueOf(Price1.getText().toString().trim());
//                    price2 = Double.valueOf(Price2.getText().toString().trim());
//
//                    Avg = ((lot1 * price1) + (lot2 * price2) / (lot1 + lot2));
//
//                    DecimalFormat dform = new DecimalFormat("#.##");
//                    String Average = dform.format(Avg);
//                    hasilHitungTextAverage.setText(Average);
//                }
//            }});


    }});

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