package com.example.tuan3_taoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
        private  Button button2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.home);

                button2 = findViewById(R.id.button2);

                button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                main();
                        }
                });
        }
        public void main(){
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
        }
}
