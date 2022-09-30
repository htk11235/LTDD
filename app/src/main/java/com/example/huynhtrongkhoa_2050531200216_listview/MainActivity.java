package com.example.huynhtrongkhoa_2050531200216_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button save;
    private EditText txt;
    private ListView listView;

    ArrayAdapter<String> adapter;
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save = findViewById(R.id.save);
        txt = findViewById(R.id.txt);
        listView = findViewById(R.id.listView);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

    }

    public void saveData(View view) {
        if(txt.getText().toString().isEmpty()){
            txt.setError("Please enter test");
        }
        else {
            list.add(txt.getText().toString());
            txt.setText("");
            adapter.notifyDataSetChanged();
        }
    }
}