package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class activity_energydrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energydrink);
        ImageButton karabrown = (ImageButton)findViewById(R.id.imageButton10);
        karabrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, com.example.page1.karabrown.class);
                startActivity(i);
            }
        });

        ImageButton LIPO = (ImageButton)findViewById(R.id.imageButton9);
        LIPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, com.example.page1.LIPO.class);
                startActivity(i);
            }
        });

        ImageButton M = (ImageButton)findViewById(R.id.imageButton22);
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, com.example.page1.M.class);
                startActivity(i);
            }
        });

        ImageButton MONSTER = (ImageButton)findViewById(R.id.imageButton6);
        MONSTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, com.example.page1.MONSTER.class);
                startActivity(i);
            }
        });

        ImageButton PEPTEIN = (ImageButton)findViewById(R.id.imageButton5);
        PEPTEIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, com.example.page1.PEPTEIN.class);
                startActivity(i);
            }
        });

        ImageButton RANGYER = (ImageButton)findViewById(R.id.imageButton4);
        RANGYER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, com.example.page1.RANGYER.class);
                startActivity(i);
            }
        });

        ImageButton READY = (ImageButton)findViewById(R.id.imageButton3);
        READY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, com.example.page1.READY.class);
                startActivity(i);
            }
        });

        ImageButton REDBULL = (ImageButton)findViewById(R.id.imageButton2);
        REDBULL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, com.example.page1.REDBULL.class);
                startActivity(i);
            }
        });

        ImageButton SHARK = (ImageButton)findViewById(R.id.imageButton11);
        SHARK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, com.example.page1.SHARK.class);
                startActivity(i);
            }
        });

        ImageButton homeAsUpIndicator = (ImageButton)findViewById(R.id.imageButton16);
        homeAsUpIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_energydrink.this, activity_menu.class);
                startActivity(i);
            }
        });



    }
}