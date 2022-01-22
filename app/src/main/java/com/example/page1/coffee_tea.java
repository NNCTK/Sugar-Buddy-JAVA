package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class coffee_tea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_tea);

        ImageButton homeAsUpIndicator = (ImageButton)findViewById(R.id.imageButton10);
        homeAsUpIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, activity_menu.class);
                startActivity(i);
            }
        });

        ImageButton arabus = (ImageButton)findViewById(R.id.imageButton1);
        arabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, ARABUS.class);
                startActivity(i);
            }
        });
        ImageButton nescafe = (ImageButton)findViewById(R.id.imageButton23);
        nescafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, NESCAFE.class);
                startActivity(i);
            }
        });
        ImageButton birdy = (ImageButton)findViewById(R.id.imageButton24);
        birdy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, BIRDY.class);
                startActivity(i);
            }
        });
        ImageButton puriku = (ImageButton)findViewById(R.id.Button7);
        puriku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, PURIKU.class);
                startActivity(i);
            }
        });
        ImageButton shizuoka = (ImageButton)findViewById(R.id.imageButton25);
        shizuoka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, SHIZUOKA.class);
                startActivity(i);
            }
        });
        ImageButton fijitea = (ImageButton)findViewById(R.id.Button9);
        fijitea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, FUJICHA.class);
                startActivity(i);
            }
        });
        ImageButton oishi = (ImageButton)findViewById(R.id.imageButton7);
        oishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, OISHI.class);
                startActivity(i);
            }
        });
        ImageButton ichitan = (ImageButton)findViewById(R.id.imageButton8);
        ichitan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, ICHITAN.class);
                startActivity(i);
            }
        });
        ImageButton lipton = (ImageButton)findViewById(R.id.Button8);
        lipton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coffee_tea.this, LIPTON.class);
                startActivity(i);
            }
        });


    }
}