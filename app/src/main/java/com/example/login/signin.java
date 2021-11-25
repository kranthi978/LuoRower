package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class signin<button> extends AppCompatActivity {
    Button btn1;
    TextView btn, test;
    RadioGroup rg;
    RadioButton rb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        btn=findViewById(R.id.sign_up);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(signin.this,
                        homeactivity.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        btn1= findViewById(R.id.sign_in_button);
        rg = findViewById(R.id.role);
        //int radioId=rg.getCheckedRadioButtonId();
       // rb=findViewById(radioId);
        test=findViewById(R.id.txt);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId=rg.getCheckedRadioButtonId();
                rb=findViewById(radioId);
                String str=String.valueOf(rb.getText());
                if(str.equals("Admin"))
                {
                    Intent i=new Intent(signin.this,
                            adminpage.class);
                    //Intent is used to switch from one activity to another.

                    startActivity(i);
                }
                else
                {
                    Intent i=new Intent(signin.this,
                            userpage.class);
                    //Intent is used to switch from one activity to another.

                    startActivity(i);
                }
            }
        });
                
        /*if(str.equals("Admin"))
        {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(signin.this,
                            adminpage.class);
                    //Intent is used to switch from one activity to another.

                    startActivity(i);
                }
            });
        }
        if(str.equals("User"))
        {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(signin.this,
                            userpage.class);
                    //Intent is used to switch from one activity to another.

                    startActivity(i);
                }
            });
        }*/



    }

}