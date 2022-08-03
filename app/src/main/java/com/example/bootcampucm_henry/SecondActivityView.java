package com.example.bootcampucm_henry;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_view);


        Button bon;

        bon = findViewById(R.id.buttonToast);

        bon.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick(View v) {

                //code
            Toast.makeText(getApplicationContext(),

            Toast.makeText(getApplicationContext() {
                Text: "Toast was here",
                Toast.LENGTH_LONG).show();

            }
        }



    }
}