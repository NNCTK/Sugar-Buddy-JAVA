package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class aww extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aww);

        ImageButton actionModeCloseDrawable = (ImageButton) findViewById(R.id.imageButton17);
        actionModeCloseDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viwe) {
                Intent i = new Intent(aww.this, SparklingWater.class);
                startActivity(i);
            }
        });
    }
}
