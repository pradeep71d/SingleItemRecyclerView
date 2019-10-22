package com.example.videoplayerrecycler;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    String[] Al;
    Context context;

    public MyAdapter(String[] al, Context context) {
        Al = al;
        this.context = context;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, int position) {
        holder.textView.setText(Al[position]);
        String url = Al[position];
        Log.d("TAg", "url=" + Al[position]);
        Uri uri = Uri.parse(url);
        holder.videoView.setVideoURI(uri);
      //  holder.videoView.start();
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.videoView.pause();
            }
        });
        holder.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.videoView.start();
            }
        });
    }

    @Override
    public int getItemCount() {
        return Al.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView textView;
        VideoView videoView;
        Button button,button2;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.t1);
            videoView = itemView.findViewById(R.id.video);
            button = itemView.findViewById(R.id.b1);
            button2=itemView.findViewById(R.id.b2);
        }
    }
}
