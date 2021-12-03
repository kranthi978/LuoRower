package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class admin_add_bike extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_bike);
        TextView btn = findViewById(R.id.go_back);
        Button btn1=findViewById(R.id.addBike);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(admin_add_bike.this,
                        adminpage.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(admin_add_bike.this,
                        bikeproofs.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        getSupportActionBar().hide();
    }
}