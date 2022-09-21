package com.example.bt_diem_danh_huynhtrongkhoa_2050531200216;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button huy;
    private Button nhap;
    private TextView name;
    private TextView mobile;
    private TextView add;
    private TextView postal;
    private TextView pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextTextPersonName_userName);
        mobile = findViewById(R.id.editTextTextPersonName_mobile);
        add = findViewById(R.id.editTextTextPersonName_address);
        postal = findViewById(R.id.editTextTextPersonName_postalCode);
        pass = findViewById(R.id.editTextTextPersonName_password);

        huy = findViewById(R.id.button_huy);
        nhap = findViewById(R.id.button_nhap);
        huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(textView.getText().toString());
            }
        });
    }
}