package com.example.baitap4_huynhtrongkhoa_2050531200216;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView signup;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = findViewById(R.id.textView_signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();
            }
        });

        login = findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlogin();
            }
        });
    }
    public void openSignup(){
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);
    }

    public void openlogin(){
        Intent intent = new Intent(this,Profile.class);
        startActivity(intent);
    }
}