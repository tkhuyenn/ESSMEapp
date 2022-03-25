package com.example.essmeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    String Home = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void onClick(View view) {
        Intent intent = new Intent(SignIn.this, Home.class);
        intent.putExtra("home", Home);
        startActivity(intent);
    }
}