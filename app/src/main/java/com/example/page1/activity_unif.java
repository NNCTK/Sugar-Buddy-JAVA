package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class activity_unif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unif);

        ImageButton homeAsUpIndicator = (ImageButton) findViewById(R.id.imageButton14);
        homeAsUpIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_unif.this, activity_juice.class);
                startActivity(i);
            }
        });


    }
}