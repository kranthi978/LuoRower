package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userpage extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);
        getSupportActionBar().hide();
        btn=findViewById(R.id.rent1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(userpage.this,
                        renterdetails.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn=findViewById(R.id.rent2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(userpage.this,
                        renter1.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn=findViewById(R.id.rent3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(userpage.this,
                        renter3.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn=findViewById(R.id.rent4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(userpage.this,
                        renter4.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn=findViewById(R.id.rent5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(userpage.this,
                        renter5.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn=findViewById(R.id.rent6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(userpage.this,
                        renter6.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn=findViewById(R.id.rent7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(userpage.this,
                        renter7.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn=findViewById(R.id.rent8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(userpage.this,
                        renter8.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn=findViewById(R.id.rent9);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(userpage.this,
                        renter9.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });


    }
}