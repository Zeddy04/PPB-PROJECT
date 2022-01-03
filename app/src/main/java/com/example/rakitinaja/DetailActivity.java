package com.example.rakitinaja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.example.rakitinaja.prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

import io.paperdb.Paper;


public class DetailActivity extends AppCompatActivity {

    ImageView tvImg;
    TextView tvTitle, tvInfo, tvPrice;
    Button addToCart;
    ImageButton back;
    String title, info, price, phone;
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvImg = findViewById(R.id.productimg);
        tvTitle = findViewById(R.id.detailtitle);
        tvInfo = findViewById(R.id.detailinfo);
        tvPrice = findViewById(R.id.detailprice);
        addToCart = findViewById(R.id.btn_cart);
        back = findViewById(R.id.btn_back);

        Paper.init(this);
        phone = Paper.book().read(Prevalent.userPhoneKey);

        getData();
        setData();

        back.setOnClickListener(v -> {
            Intent intent = new Intent(DetailActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        addToCart.setOnClickListener(v -> addToCartDatabase(phone, title, price));

    }

    public void addToCartDatabase(final String phone, final String title, final String price) {

        String saveCurrentDate;
        DatabaseReference cartListRef;

        Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat currentDate = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss a");
        saveCurrentDate = currentDate.format(calendar.getTime());
        cartListRef = FirebaseDatabase.getInstance("https://rakitinajacartdatabase-default-rtdb.asia-southeast1.firebasedatabase.app").getReference();
        
        cartListRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(!(snapshot.child("Cart List").exists())){
                    HashMap<String, Object> cartMap = new HashMap<>();
                    cartMap.put("Product", title);
                    cartMap.put("Price", price);
                    cartMap.put("Time",saveCurrentDate);

                    cartListRef.child("Cart List").child(phone).child("Product").child(saveCurrentDate).updateChildren(cartMap)
                            .addOnCompleteListener(task -> {
                                if(task.isSuccessful()){
                                    Toast.makeText(DetailActivity.this, "Added To Cart", Toast.LENGTH_SHORT).show();
                                }
                            });
                }
                else {
                    HashMap<String, Object> cartMap = new HashMap<>();
                    cartMap.put("Product", title);
                    cartMap.put("Price", price);
                    cartMap.put("Time",saveCurrentDate);

                    cartListRef.child("Cart List").child(phone).child("Product").child(saveCurrentDate).updateChildren(cartMap)
                            .addOnCompleteListener(task -> {
                                if(task.isSuccessful()){
                                    Toast.makeText(DetailActivity.this, "Added To Cart", Toast.LENGTH_SHORT).show();

                                }
                            });
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    public void getData(){

        title = getIntent().getStringExtra("title");
        img = getIntent().getIntExtra("img",1);
        info = getIntent().getStringExtra("info");
        price = getIntent().getStringExtra("price");

    }

    public void setData(){
        tvImg.setImageResource(img);
        tvTitle.setText(title);
        tvInfo.setText(info);
        tvPrice.setText(price);
    }
}