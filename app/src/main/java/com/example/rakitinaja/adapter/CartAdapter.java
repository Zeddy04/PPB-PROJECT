package com.example.rakitinaja.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rakitinaja.R;
import com.example.rakitinaja.model.CartModel;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {

    ArrayList<CartModel> listCart;
    Context context;

    public CartAdapter(ArrayList<CartModel> listCart, Context context) {
        this.listCart = listCart;
        this.context = context;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
        holder.price.setText(listCart.get(position).getPrice());
        holder.title.setText(listCart.get(position).getProduct());
    }

    @Override
    public int getItemCount() {
        return listCart.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.carttitleimg);
            price = itemView.findViewById(R.id.cartpriceimg);
        }
    }
}
