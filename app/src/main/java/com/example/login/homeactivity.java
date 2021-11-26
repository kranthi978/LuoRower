package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class homeactivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    Spinner spinner;
    TextView btn;
    EditText fname,mailid,password;
    Button register;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        mAuth = FirebaseAuth.getInstance();
        spinner = (Spinner) findViewById(R.id.select);
        adapter = ArrayAdapter.createFromResource(this, R.array.names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " Selected", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn=findViewById(R.id.sign_in);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(homeactivity.this,
                        signin.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
            }
        });
        getSupportActionBar().hide();
        fname=findViewById(R.id.user_name);
        mailid=findViewById(R.id.email);
        password=findViewById(R.id.pass);
        register=findViewById(R.id.regbtn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                // register the user in firebase

                mAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(homeactivity.this, "User Created", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(homeactivity.this , signin.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(homeactivity.this, "Error ! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}