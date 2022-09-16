package com.example.bt4_huynhtrongkhoa_2050531200216;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button_clickme1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome(textView.getText().toString());
            }
        });
    }

    public void openHome(String text){
        Intent intent = new Intent(this,Home.class);

        Bundle bundle = new Bundle();

        bundle.putString("text", text);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}