package com.example.rakitinaja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.Toast;

import com.example.rakitinaja.model.UserModel;
import com.example.rakitinaja.prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    Button btnJoin, btnLogin;
    String userPhone, userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Paper.init(this);
        btnJoin = findViewById(R.id.btn_join);
        btnLogin = findViewById(R.id.btn_tologin);
        userPhone = Paper.book().read(Prevalent.userPhoneKey);
        userPassword = Paper.book().read(Prevalent.userPasswordKey);

        btnJoin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        if (!TextUtils.isEmpty(userPhone) && !TextUtils.isEmpty(userPassword)){
            AllowAccess(userPhone,userPassword);
        }

    }

    private void AllowAccess(String userPhone, String userPassword) {

        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance("https://rakitinajacartdatabase-default-rtdb.asia-southeast1.firebasedatabase.app").getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.child("Users").child(userPhone).exists()){
                    UserModel user = snapshot.child("Users").child(userPhone).getValue(UserModel.class);

                    assert user != null;
                    if(user.getPhone().equals(userPhone)){
                        if(user.getPassword().equals(userPassword)){
                            Toast.makeText(MainActivity.this, "Succes Login", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                            startActivity(intent);
                        }
                    }
                }

                else{
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}