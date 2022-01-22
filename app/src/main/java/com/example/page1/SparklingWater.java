package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SparklingWater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sparkling_water);
        ImageButton coke = (ImageButton) findViewById(R.id.imageButton);
        coke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, com.example.page1.coke.class);
                startActivity(i);
            }
        });

        ImageButton pepsi = (ImageButton) findViewById(R.id.imageButton2);
        pepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, com.example.page1.pepsi.class);
                startActivity(i);
            }
        });

        ImageButton est = (ImageButton) findViewById(R.id.imageButton3);
        est.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, est.class);
                startActivity(i);
            }
        });

        ImageButton spite = (ImageButton) findViewById(R.id.imageButton4);
        spite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, spite.class);
                startActivity(i);
            }
        });

        ImageButton fanta = (ImageButton) findViewById(R.id.imageButton5);
        fanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, fanta.class);
                startActivity(i);
            }
        });

        ImageButton mirin = (ImageButton) findViewById(R.id.imageButton6);
        mirin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, com.example.page1.mirin.class);
                startActivity(i);
            }
        });

        ImageButton aww = (ImageButton) findViewById(R.id.imageButton10);
        aww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, com.example.page1.aww.class);
                startActivity(i);
            }
        });

        ImageButton saweb = (ImageButton) findViewById(R.id.imageButton8);
        saweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, saweb.class);
                startActivity(i);
            }
        });

        ImageButton big = (ImageButton) findViewById(R.id.imageButton9);
        big.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, com.example.page1.big.class);
                startActivity(i);
            }
        });

        ImageButton actionModeCloseDrawable = (ImageButton) findViewById(R.id.imageButton17);
        actionModeCloseDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SparklingWater.this, activity_menu.class);
                startActivity(i);
            }
        });
    }
}