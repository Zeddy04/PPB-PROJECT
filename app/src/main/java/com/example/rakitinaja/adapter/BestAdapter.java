package com.example.rakitinaja.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rakitinaja.DetailActivity;
import com.example.rakitinaja.R;
import com.example.rakitinaja.model.BestModel;

import java.util.ArrayList;

public class BestAdapter extends RecyclerView.Adapter<BestAdapter.ModelViewProductHolder> {

    ArrayList<BestModel> listProduct;
    Context context;
    ArrayList<String> listInfo;

    public BestAdapter(ArrayList<BestModel> listProduct, Context context, ArrayList<String> listInfo) {
        this.listProduct = listProduct;
        this.context = context;
        this.listInfo = listInfo;
    }



    @NonNull
    @Override
    public BestAdapter.ModelViewProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.best_item,parent,false);
        return new BestAdapter.ModelViewProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BestAdapter.ModelViewProductHolder holder,  int position) {
        holder.tvTitleProduct.setText(listProduct.get(position).getTitle());
        holder.tvImgProduct.setImageResource(listProduct.get(position).getImgProduct());
        holder.tvPriceProduct.setText(listProduct.get(position).getPrice());

        holder.mainCard.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("img", listProduct.get(position).getImgProduct());
            intent.putExtra("title",listProduct.get(position).getTitle());
            intent.putExtra("price", listProduct.get(position).getPrice());
            intent.putExtra("info",listInfo.get(position));
            String phone = intent.getStringExtra("phone");
            intent.putExtra("phone",phone);
            context.startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return listProduct.size();
    }

    public static class ModelViewProductHolder extends RecyclerView.ViewHolder{

        TextView tvTitleProduct, tvPriceProduct;
        ImageView tvImgProduct;
        CardView mainCard;

        public ModelViewProductHolder(@NonNull View itemView) {
            super(itemView);

            tvTitleProduct = itemView.findViewById(R.id.titleimg);
            tvImgProduct = itemView.findViewById(R.id.imgchild2);
            tvPriceProduct = itemView.findViewById(R.id.priceimg);
            mainCard = itemView.findViewById(R.id.maincard);
        }
    }
}
