package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class userpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);
        getSupportActionBar().hide();
    }
}