package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signin<button> extends AppCompatActivity {
    Button btn1;
    TextView btn, test;
    RadioGroup rg;
    RadioButton rb;
    EditText mailid,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        btn=findViewById(R.id.sign_up);
        getSupportActionBar().hide();
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
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
        mailid= findViewById(R.id.email);
        password= findViewById(R.id.pass);
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
                    String email = mailid.getText().toString().trim();
                    String pwd = password.getText().toString().trim();
                    if(TextUtils.isEmpty(email)){
                        mailid.setError("Email is Required");
                        return;
                    }

                    if(TextUtils.isEmpty(pwd)){
                        password.setError("Password is Required");
                        return;
                    }

                    if(password.length()<6){
                        password.setError("Password must be >= 6 characters");
                        return;
                    }

                    //authenticate user

                    mAuth.signInWithEmailAndPassword(email,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(signin.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(signin.this , adminpage.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(signin.this, "Error !" + task.getException() , Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                else
                {
                    String email = mailid.getText().toString().trim();
                    String pwd = password.getText().toString().trim();
                    if(TextUtils.isEmpty(email)){
                        mailid.setError("Email is Required");
                        return;
                    }

                    if(TextUtils.isEmpty(pwd)){
                        password.setError("Password is Required");
                        return;
                    }

                    if(password.length()<6){
                        password.setError("Password must be >= 6 characters");
                        return;
                    }

                    //authenticate user

                    mAuth.signInWithEmailAndPassword(email,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(signin.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(signin.this , userpage.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(signin.this, "Error !" + task.getException() , Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }

}