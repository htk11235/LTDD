package com.example.bt4_huynhtrongkhoa_2050531200216;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle bundle = getIntent().getExtras();

        String title = bundle.getString("text");

        textView = findViewById(R.id.textView_texthere);
        textView.setText(title);
        button = findViewById(R.id.button_clickme2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain(textView.getText().toString());
            }
        });
    }
    public void openMain(String text){
        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);
    }
}