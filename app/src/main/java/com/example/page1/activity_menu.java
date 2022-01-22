package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class activity_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        ImageButton sparkling_water__2_ = (ImageButton)findViewById(R.id.Button6);
        sparkling_water__2_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_menu.this, SparklingWater.class);
                startActivity(i);
            }
        });

        ImageButton juice__1_ = (ImageButton)findViewById(R.id.Button7);
        juice__1_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_menu.this,activity_juice.class);
                startActivity(i);
            }
        });

        ImageButton milk = (ImageButton)findViewById(R.id.imageButton);
        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_menu.this,activity_milk.class);
                startActivity(i);
            }
        });

        ImageButton energy_drink = (ImageButton)findViewById(R.id.Button8);
        energy_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_menu.this,activity_energydrink.class);
                startActivity(i);
            }
        });


        ImageButton coffee___tea = (ImageButton)findViewById(R.id.imageButton20);
        coffee___tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_menu.this, coffee_tea.class);
                startActivity(i);
            }
        });

    }
}