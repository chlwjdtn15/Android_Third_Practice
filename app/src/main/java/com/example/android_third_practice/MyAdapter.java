package com.example.android_third_practice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<Product> list;


    MyAdapter( List<Product> list) {


        this.list = list;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());


        View view = layoutInflater.inflate(R.layout.item_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder( view);

        return viewHolder;
    }


    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    holder.image.setImageResource(list.get(position).getImage());
    holder.name.setText(list.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

   public static class ViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView name;





        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            image = itemView.findViewById(R.id.imageView);

            name = itemView.findViewById(R.id.ProductTv);


        }
    }
}
