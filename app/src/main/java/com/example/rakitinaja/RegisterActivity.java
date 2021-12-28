package com.example.rakitinaja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.rakitinaja.prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Objects;

import io.paperdb.Paper;

public class RegisterActivity extends AppCompatActivity {

    EditText inputName, inputPhone, inputPassword;
    ProgressBar loadingBar;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = findViewById(R.id.btn_register);
        inputName = findViewById(R.id.etNama);
        inputPhone = findViewById(R.id.etNomer);
        inputPassword = findViewById(R.id.etPassword);
        loadingBar = new ProgressBar(this);
        Paper.init(this);

        btnRegister.setOnClickListener(v -> CreateAccount());
    }

    private void CreateAccount() {

        String name = inputName.getText().toString();
        String phone = inputPhone.getText().toString();
        String password = inputPassword.getText().toString();

        if(TextUtils.isEmpty(name)){
            Toast.makeText(this,"Please write your name",Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(phone)){
            Toast.makeText(this,"Please write your phone number",Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please write your password",Toast.LENGTH_SHORT).show();
        }
        else {
            Validate(name, phone, password);
        }


    }

    private void Validate(final String name, final String phone, final String password) {

       final DatabaseReference RootRef;
       RootRef = FirebaseDatabase.getInstance("https://rakitinajacartdatabase-default-rtdb.asia-southeast1.firebasedatabase.app").getReference();

       RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot snapshot) {
               if(!(snapshot.child("Users").child(phone).exists())){
                   HashMap<String, Object> userDataMap = new HashMap<>();
                   userDataMap.put("name", name);
                   userDataMap.put("phone", phone);
                   userDataMap.put("password", password);

                   Paper.book().write(Prevalent.userPhoneKey, phone);
                   Paper.book().write(Prevalent.userPasswordKey, password);

                   RootRef.child("Users").child((String) Objects.requireNonNull(userDataMap.get("phone"))).updateChildren(userDataMap)
                           .addOnCompleteListener(task -> {
                               if(task.isSuccessful()){
                                   Toast.makeText(RegisterActivity.this, "Success", Toast.LENGTH_SHORT).show();

                                   Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                   startActivity(intent);
                               }
                           });
               }
               else{
                   Toast.makeText(RegisterActivity.this,"phone already exists",Toast.LENGTH_LONG).show();
               }
           }

           @Override
           public void onCancelled(@NonNull DatabaseError error) {

           }
       });

    }

}