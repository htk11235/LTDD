package com.example.app_alll;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class home extends AppCompatActivity {

    private RecyclerView recycler_view;
    private recom_adp adapter;
    private ImageView imageView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        recycler_view = findViewById(R.id.recyclerView);
        adapter = new recom_adp(this);



        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recycler_view.setLayoutManager(gridLayoutManager);

        adapter.setData(getRecomList());

        recycler_view.setAdapter(adapter);
        recycler_view.setOnClickListener(v -> {
            startActivity(new Intent(home.this, song.class));
            finish();
        });
        imageView6 = findViewById(R.id.imageView6);
        imageView6.setOnClickListener(v -> {
            startActivity(new Intent(home.this, song.class));
            finish();
        });
    }

    private List<recom> getRecomList() {
        List<recom> list = new ArrayList<>();
        list.add(new recom(R.drawable.art, "Liked songs"));
        list.add(new recom(R.drawable.art__1_, "Sun R"));
        list.add(new recom(R.drawable.art__2_, "Lartists"));
        list.add(new recom(R.drawable.art__3_, "Francisco"));
        list.add(new recom(R.drawable.art__4_, "Benny "));
        list.add(new recom(R.drawable.art__5_, "Oh "));
        list.add(new recom(R.drawable.art__6_, "Driving "));
        list.add(new recom(R.drawable.art__7_, "Ldiscovered "));
        list.add(new recom(R.drawable.art__8_, "Whenever "));
        list.add(new recom(R.drawable.art__9_, "Well"));
        list.add(new recom(R.drawable.art__10_, "Lost "));
        list.add(new recom(R.drawable.art__11_, "God "));
        list.add(new recom(R.drawable.art__12_, "Vibes "));
        list.add(new recom(R.drawable.art__13_, "SOOTHING "));
        list.add(new recom(R.drawable.art__14_, "Love "));
        list.add(new recom(R.drawable.art__15_, "Lil "));

        return list;
    }

}