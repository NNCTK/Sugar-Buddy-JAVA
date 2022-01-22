package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void passData(View view){


        String data1 = " 16 g ";
        String data2 = " CHILD ";

        Intent i1 = new Intent(this,activity_home.class);

        i1.putExtra("data1",data1);
        i1.putExtra("data2",data2);

        startActivity(i1);


    }

    public  void passData1(View view){

        String data1 = " 24 g ";
        String data2 = " TEEN ";

        Intent i2 = new Intent(this,activity_home.class);

        i2.putExtra("data1",data1);
        i2.putExtra("data2",data2);

        startActivity(i2);


    }
    public  void passData2(View view){

        String data1 = " 24 g ";
        String data2 = " ADULT ";

        Intent i3 = new Intent(this,activity_home.class);


        i3.putExtra("data1",data1);
        i3.putExtra("data2",data2);


        startActivity(i3);


    }
    public  void passData3(View view){

        String data1 = " 16 g ";
        String data2 = " OVER ";

        Intent i4 = new Intent(this,activity_home.class);

        i4.putExtra("data1",data1);
        i4.putExtra("data2",data2);



        startActivity(i4);


    }



}