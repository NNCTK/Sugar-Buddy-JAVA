package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class activity_juice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice);
        ImageButton c_vitt = (ImageButton)findViewById(R.id.imageButton);
        ImageButton homeAsUpIndicator = (ImageButton)findViewById(R.id.imageButton14);
        ImageButton kato = (ImageButton)findViewById(R.id.imageButton10);
        ImageButton cocomax = (ImageButton)findViewById(R.id.imageButton7);
        ImageButton deedo = (ImageButton)findViewById(R.id.imageButton8);
        ImageButton doykum = (ImageButton)findViewById(R.id.imageButton9);
        ImageButton minute_maid = (ImageButton)findViewById(R.id.imageButton11);
        ImageButton sappe = (ImageButton)findViewById(R.id.imageButton12);
        ImageButton tipco = (ImageButton)findViewById(R.id.imageButton13);
        ImageButton unif = (ImageButton)findViewById(R.id.imageButton15);
        c_vitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this,activity_c_vitt.class);
                startActivity(i);
            }
        });
        homeAsUpIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this, activity_menu.class);
                startActivity(i);
            }
        });
        kato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this, activity_kato.class);
                startActivity(i);
            }
        });
        cocomax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this, activity_cocomax.class);
                startActivity(i);
            }
        });
        deedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this, activity_deedo.class);
                startActivity(i);
            }
        });
        doykum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this, activity_doikhan.class);
                startActivity(i);
            }
        });
        minute_maid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this, activity_minutemaid.class);
                startActivity(i);
            }
        });
        sappe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this, activity_sappe.class);
                startActivity(i);
            }
        });
        tipco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this, activity_tipco.class);
                startActivity(i);
            }
        });
        unif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_juice.this, activity_unif.class);
                startActivity(i);
            }
        });

    }
}