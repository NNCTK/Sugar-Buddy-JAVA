package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class activity_milk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.milk_activity);
        ImageButton homeAsUpIndicator = (ImageButton) findViewById(R.id.imageButton21);
        homeAsUpIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this, activity_menu.class);
                startActivity(i);
            }
        });


        ImageButton betagen = (ImageButton) findViewById(R.id.imageButton22);
        betagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this, activity_betagen.class);
                startActivity(i);
            }

        });
        ImageButton dutchmill = (ImageButton) findViewById(R.id.imageButton23);
        dutchmill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this, activity_dutchmill.class);
                startActivity(i);
            }
        });
        ImageButton meiji = (ImageButton) findViewById(R.id.imageButton24);
        meiji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this, activity_meiji.class);
                startActivity(i);
            }

        });
        ImageButton foremost = (ImageButton) findViewById(R.id.imageButton25);
        foremost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this,activity_foremost.class);
                startActivity(i);
            }

        });
        ImageButton thaidenmark = (ImageButton) findViewById(R.id.imageButton26);
        thaidenmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this, activity_thaidenmark.class);
                startActivity(i);
            }

        });
        ImageButton nongpho = (ImageButton) findViewById(R.id.imageButton27);
        nongpho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this,activity_nongpho.class);
                startActivity(i);
            }

        });

        ImageButton ovaltine = (ImageButton) findViewById(R.id.imageButton28);
        ovaltine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this, activity_ovaltine.class);
                startActivity(i);
            }

        });
        ImageButton milo = (ImageButton) findViewById(R.id.imageButton29);
        milo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this, activity_milo.class);
                startActivity(i);
            }

        });
        ImageButton vitamilk = (ImageButton) findViewById(R.id.imageButton30);
        vitamilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_milk.this, activity_vitamilk.class);
                startActivity(i);
            }

        });
    }
}
