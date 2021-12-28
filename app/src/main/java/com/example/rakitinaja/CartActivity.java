package com.example.rakitinaja;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rakitinaja.adapter.CartAdapter;
import com.example.rakitinaja.model.CartModel;
import com.example.rakitinaja.prevalent.Prevalent;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import io.paperdb.Paper;


public class CartActivity extends AppCompatActivity {

    /*RecyclerView recyclerView;
    ArrayList<CartModel> listCart;
    String saveCurrentTime, saveCurrentDate;
    FirebaseRecyclerAdapter<CartModel, CartViewHolder> fireadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerView = findViewById(R.id.cartmaincard);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Paper.init(this);
        String phone = Paper.book().read(Prevalent.userPhoneKey);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat currentDate = new SimpleDateFormat("MMM dd, yyyy");
        saveCurrentDate = currentDate.format(calendar.getTime());
        SimpleDateFormat currentTime = new SimpleDateFormat("HH:MM:ss a");
        saveCurrentTime = currentTime.format(calendar.getTime());

        DatabaseReference databaseCart = FirebaseDatabase.getInstance("https://rakitinajacartdatabase-default-rtdb.asia-southeast1.firebasedatabase.app").getReference();
        Query query = databaseCart.child("Cart List");
        FirebaseRecyclerOptions<CartModel> options =
                new FirebaseRecyclerOptions.Builder<CartModel>()
                        .setQuery(query, CartModel.class).build();

        fireadapter = new FirebaseRecyclerAdapter<CartModel,CartViewHolder>(options) {
                    @NonNull
                    @Override
                    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item,parent,false);
                        return new CartViewHolder(view);
                    }

                    @Override
                    protected void onBindViewHolder(@NonNull CartViewHolder cartViewHolder, int i, @NonNull CartModel cartModel) {
                        cartViewHolder.setCart(cartModel );
                    }
                };
                recyclerView.setAdapter(fireadapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        fireadapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        fireadapter.stopListening();
    }*/
    RecyclerView recyclerView;
    ArrayList<CartModel> listCart;
    CartAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Paper.init(this);
        String phone = Paper.book().read(Prevalent.userPhoneKey);

        recyclerView = findViewById(R.id.cartmaincard);
        DatabaseReference reff = FirebaseDatabase.getInstance("https://rakitinajacartdatabase-default-rtdb.asia-southeast1.firebasedatabase.app")
                .getReference().child("Cart List").child(phone).child("Product");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listCart = new ArrayList<>();
        adapter = new CartAdapter(listCart,this);
        recyclerView.setAdapter(adapter);

        reff.addValueEventListener(new ValueEventListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    CartModel cartModel = dataSnapshot.getValue(CartModel.class);
                    listCart.add(cartModel);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}