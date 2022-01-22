package com.example.page1;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.ArrayList;

public class activity_home<notificationId, data2, a> extends AppCompatActivity {

    private EditText addText;
    private EditText addText1;
    private TextView addText2;
    private Button addButt;
    private ListView addList;


    private ArrayList<String> addItem;
    private ArrayAdapter<String> addAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle b = getIntent().getExtras();

        String data1 = b.getString("data1");
        String data2 = b.getString("data2");

        TextView textView11 = (TextView) findViewById(R.id.textView11);
        TextView textView12 = (TextView) findViewById(R.id.textView12);

        textView11.setText(data1);
        textView12.setText(data2);


        init();
        addButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addItem.add("รายการ  "+ addText.getText().toString());
                addItem.add("ปริมาณน้ำตาล  "+ addText1.getText().toString() + " g.");
                addItem.add("---------------------------------------------------------------------------------");
                addAdapter.notifyDataSetChanged();
            }
        });

        ImageButton ic_input_add = (ImageButton)findViewById(R.id.floatingActionButton);
        ic_input_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_home.this, activity_menu.class);
                startActivity(i);
            }
        });


    }

    public void init(){
        addText = (EditText)findViewById(R.id.addText);
        addText1 = (EditText)findViewById(R.id.addText1);
        addButt =  (Button)findViewById(R.id.addButt);
        addList = (ListView)findViewById(R.id.addList);
        addText2 = (TextView)findViewById(R.id.addText2);

        addItem = new ArrayList<String>();
        addAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, addItem);
        addList.setAdapter(addAdapter);

    }
    double text1,sugar;
    public void vary(){
        text1 = Double.parseDouble(addText1.getText().toString());
    }

    public void ADD(View v){
        try {
            vary();
            sugar = sugar + text1;
            addText2.setText(Double.toString(sugar));
        }
        catch (Exception ex){
            addText2.setText("0.0");

        }

            if (sugar > 16) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    NotificationChannel channel = new NotificationChannel("My Notify", "My Notify", NotificationManager.IMPORTANCE_DEFAULT);
                    NotificationManager manager = getSystemService(NotificationManager.class);
                    manager.createNotificationChannel(channel);
                }

                Button button5 = findViewById(R.id.button5);

                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //notify
                        NotificationCompat.Builder builder = new NotificationCompat.Builder(activity_home.this, "My Notify");
                        builder.setContentTitle("DANGER !!");
                        builder.setContentText("[CHILD,OVER] Don't eat a lot of sugar.");
                        builder.setSmallIcon(R.drawable.sugarbuddy);
                        builder.setAutoCancel(true);

                        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(activity_home.this);
                        managerCompat.notify(1, builder.build());
                    }
                });
            }

            if(sugar > 24) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    NotificationChannel channel = new NotificationChannel("My Notify", "My Notify", NotificationManager.IMPORTANCE_DEFAULT);
                    NotificationManager manager = getSystemService(NotificationManager.class);
                    manager.createNotificationChannel(channel);
                }


                Button button6 = findViewById(R.id.button6);

                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //notify
                        NotificationCompat.Builder builder = new NotificationCompat.Builder(activity_home.this, "My Notify");
                        builder.setContentTitle("DANGER !!");
                        builder.setContentText("[TEEN,ADULT] Don't eat a lot of sugar.");
                        builder.setSmallIcon(R.drawable.sugarbuddy);
                        builder.setAutoCancel(true);

                        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(activity_home.this);
                        managerCompat.notify(1, builder.build());
                    }
                });

            }


        }


}



