package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.imageview.ShapeableImageView;

public class ActivityMain extends AppCompatActivity {
   //  RecyclerView recyclerView;
     ShapeableImageView shapeableImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        shapeableImageView = findViewById(R.id.img_img);
        shapeableImageView = findViewById(R.id.img_2);
       // recyclerView = findViewById(R.id.recycle_view);
    }
}