package com.example.app_alll;

import static com.example.app_alll.R.id.signup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private TextView signup;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        signup = findViewById(signup1);
        signup.setOnClickListener(v -> {
            startActivity(new Intent(login.this, signup.class));
            finish();
        });
        login = findViewById(R.id.login);
        login.setOnClickListener(v -> {
            startActivity(new Intent(login.this, home.class));
            finish();
        });
    }
}