package com.example.huynhtrongkhoa_2050531200216_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Do you want to remove "+list.get(i)+"?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                list.remove(i);
                                adapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).create().show();

                return false;
            }
        });
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