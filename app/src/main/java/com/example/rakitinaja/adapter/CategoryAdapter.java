package com.example.rakitinaja.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rakitinaja.R;
import com.example.rakitinaja.model.CategoryModel;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ModelViewHolder> {

    ArrayList<CategoryModel> listModel;

    public CategoryAdapter(ArrayList<CategoryModel> listModel) {
        this.listModel = listModel;
    }

    @NonNull
    @Override
    public CategoryAdapter.ModelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item,parent,false);
        return new ModelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ModelViewHolder holder, int position) {
        holder.tvImg.setImageResource(listModel.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return listModel.size();
    }

    public static class ModelViewHolder extends RecyclerView.ViewHolder {

        ImageView tvImg;


        public ModelViewHolder(@NonNull View itemView) {
            super(itemView);

            tvImg = itemView.findViewById(R.id.imgchild);


        }
    }



}
