package com.example.bt_diem_danh_huynhtrongkhoa_2050531200216;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class prf extends AppCompatActivity {
    private Button trolai;
    private TextView name,email,mobile,add,postal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prf);

        Bundle bundle = getIntent().getExtras();

        name = findViewById(R.id.textViewname);
        email = findViewById(R.id.textView2email);
        mobile = findViewById(R.id.textView_mobile);
        add = findViewById(R.id.textView_add);
        postal = findViewById(R.id.textView_postal);
        trolai = findViewById(R.id.button_trove);

        name.setText(bundle.getString("name"));
        email.setText(bundle.getString("email"));
        mobile.setText(bundle.getString("mobile"));
        add.setText(bundle.getString("add"));
        postal.setText(bundle.getString("postal"));
        trolai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
    }
    public void openMain(){
        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);
    }
}