package com.example.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Placeholder;
import androidx.recyclerview.widget.RecyclerView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.http.Body;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>{
    List<RetroPhoto>datalist;
    Context context;
    public CustomAdapter(Context context,List<RetroPhoto> datalist) {
        this.datalist = datalist;
        this.context = context;
    }



    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.textitle.setText(datalist.get(position).getTitle());
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(datalist.get(position).getThumbnailUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView textitle;
        ImageView image;
        Body body;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            textitle = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.image);
            body = itemView.findViewById(R.id.body);
        }
    }

}