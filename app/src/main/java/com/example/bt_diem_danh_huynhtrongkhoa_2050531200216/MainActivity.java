package com.example.bt_diem_danh_huynhtrongkhoa_2050531200216;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    private TextView email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextTextPersonName_userName);
        mobile = findViewById(R.id.editTextTextPersonName_mobile);
        add = findViewById(R.id.editTextTextPersonName_address);
        postal = findViewById(R.id.editTextTextPersonName_postalCode);
        email = findViewById(R.id.editTextTextPersonName_email);

        huy = findViewById(R.id.button_huy);
        nhap = findViewById(R.id.button_nhap);
        huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });
        nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPrf(name.getText().toString(),mobile.getText().toString(),add.getText().toString(),postal.getText().toString(),email.getText().toString());
            }
        });
    }
    public void openPrf(String name,String mobile,String add,String postal,String email){
        Intent intent = new Intent(this,prf.class);

        Bundle bundle = new Bundle();

        bundle.putString("name", name);
        bundle.putString("mobile", mobile);
        bundle.putString("add", add);
        bundle.putString("postal", postal);
        bundle.putString("email", email);


        intent.putExtras(bundle);

        startActivity(intent);
    }
    public void clear(){
        name.setText("");
        email.setText("");
        mobile.setText("");
        add.setText("");
        postal.setText("");
    }
}