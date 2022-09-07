package com.example.bmi_cal_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageView imageView;
    private TextView textView;
    private TextView weight;
    private TextView height;
    private TextView BMI_x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView_status);
        textView = findViewById(R.id.textView_status);
        weight = findViewById(R.id.editTextTextPersonName_weight);
        height = findViewById(R.id.editTextTextPersonName_height);
        BMI_x = findViewById(R.id.textView_BMI);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weight.setHint("");
            }
        });
        height.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                height.setHint("");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal(Double.parseDouble(weight.getText().toString()),Double.parseDouble(height.getText().toString()));
            }
        });
    }
    public void cal(double w, double h) {
        DecimalFormat f = new DecimalFormat("##.00");
        double BMI = w/(h*h/10000);
        if(w<=0 || h<=0){
            BMI_x.setText("Positive numbers only!");
            return;
        }
        if(BMI<18){
            textView.setText("Under Weight");
            imageView.setImageResource(R.mipmap.under_weight__foreground);
        } else if (BMI<24.9){
            textView.setText("Normal Weight");
            imageView.setImageResource(R.mipmap.normal_weight_foreground);
        } else if (BMI<29.9){
            textView.setText("Obese I");
            imageView.setImageResource(R.mipmap.ob1_foreground);
        }else if (BMI<34.9) {
            textView.setText("Obese II");
            imageView.setImageResource(R.mipmap.ob2_foreground);
        } else {
            textView.setText("Obese III");
            imageView.setImageResource(R.mipmap.ob3_foreground);
        }
        BMI_x.setText(String.valueOf(f.format(BMI)));
    }
}