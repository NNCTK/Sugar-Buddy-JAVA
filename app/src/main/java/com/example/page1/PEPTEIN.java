package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PEPTEIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_e_p_t_e_i_n);
        ImageButton homeAsUpIndicator = (ImageButton)findViewById(R.id.imageButton17);
        homeAsUpIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PEPTEIN.this, activity_energydrink.class);
                startActivity(i);
            }
        });
    }
}