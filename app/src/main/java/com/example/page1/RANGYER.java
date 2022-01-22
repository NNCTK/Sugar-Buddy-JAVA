package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RANGYER extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_a_n_g_y_e_r);
        ImageButton homeAsUpIndicator = (ImageButton)findViewById(R.id.imageButton18);
        homeAsUpIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RANGYER.this, activity_energydrink.class);
                startActivity(i);
            }
        });
    }
}