package com.example.videoplayerrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.MediaController;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList personNames;
    String url []={"https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4","https://clips.vorwaerts-gmbh.de/VfE_html5.mp4","https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4","https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4","https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        personNames= new ArrayList();
      //  MediaController midiacontrtoler = new MediaController(this);

        MyAdapter myAdapter = new MyAdapter(url,this);
        recyclerView.setAdapter(myAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


    }

}
