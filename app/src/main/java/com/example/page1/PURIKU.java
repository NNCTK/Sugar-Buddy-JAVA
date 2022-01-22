package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class PURIKU extends AppCompatActivity {

    List<String> arrList = new ArrayList<String>();
    TextView txtView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puriku);

        ImageButton homeAsUpIndicator = (ImageButton) findViewById(R.id.imageButton10);
        homeAsUpIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PURIKU.this, coffee_tea.class);
                startActivity(i);
            }
        });
    }
}