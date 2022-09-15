package com.example.baitap4_huynhtrongkhoa_2050531200216;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {
    private Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signin = findViewById(R.id.button3);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();
            }
        });
    }

    public void openSignup(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}