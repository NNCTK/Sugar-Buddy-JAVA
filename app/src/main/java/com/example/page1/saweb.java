package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class saweb extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saweb);
        ImageButton actionModeCloseDrawable = (ImageButton) findViewById(R.id.imageButton17);
        actionModeCloseDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(saweb.this, SparklingWater.class);
                startActivity(i);
            }
        });
    }
}