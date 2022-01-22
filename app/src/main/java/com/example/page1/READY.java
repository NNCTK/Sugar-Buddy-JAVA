package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class READY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_e_a_d_y);
        ImageButton homeAsUpIndicator = (ImageButton)findViewById(R.id.imageButton19);
        homeAsUpIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(READY.this, activity_energydrink.class);
                startActivity(i);
            }
        });
    }
}