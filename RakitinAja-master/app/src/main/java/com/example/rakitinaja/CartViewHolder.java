package com.example.rakitinaja;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rakitinaja.model.CartModel;

public class CartViewHolder extends RecyclerView.ViewHolder{
    TextView atitle, aprice;
    public CartViewHolder(@NonNull View itemView) {


        super(itemView);
        atitle = itemView.findViewById(R.id.carttitleimg);
        aprice = itemView.findViewById(R.id.cartpriceimg);

    }
    void setCart(CartModel cartModel){
        String cartTitle = cartModel.getProduct();
        atitle.setText(cartTitle);

        String cartPrice = cartModel.getPrice();
        aprice.setText(cartPrice);
    }



}
