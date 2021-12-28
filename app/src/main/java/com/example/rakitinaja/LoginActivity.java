package com.example.rakitinaja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rakitinaja.model.UserModel;
import com.example.rakitinaja.prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import io.paperdb.Paper;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText inputNomer, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        inputNomer = findViewById(R.id.etLogNomer);
        inputPassword = findViewById(R.id.etLogPassword);
        Paper.init(this);
        btnLogin.setOnClickListener(v -> AllowToLogin());
    }

    private void AllowToLogin() {

        String phone = inputNomer.getText().toString();
        String password = inputPassword.getText().toString();

        if(TextUtils.isEmpty(phone)){
            Toast.makeText(this,"Please write your phone number",Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please write your password",Toast.LENGTH_SHORT).show();
        }
        else {
            Validate(phone, password);
        }

    }

    private void Validate(final String phone, final String password) {

        Paper.book().write(Prevalent.userPhoneKey, phone);
        Paper.book().write(Prevalent.userPasswordKey, password);

        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance("https://rakitinajacartdatabase-default-rtdb.asia-southeast1.firebasedatabase.app").getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.child("Users").child(phone).exists()){
                    UserModel user = snapshot.child("Users").child(phone).getValue(UserModel.class);

                    assert user != null;
                    if(user.getPhone().equals(phone)){
                        if(user.getPassword().equals(password)){
                            Toast.makeText(LoginActivity.this, "Succes Login", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                            startActivity(intent);
                        }
                    }
                }

                else{
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}