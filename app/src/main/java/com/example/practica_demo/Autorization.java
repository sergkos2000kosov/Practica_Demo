package com.example.practica_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Autorization extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autorization);
    }
    @Override
    public  void OnClick(View v)
    {
        Intent intent = new Intent(Autorization.this, Authorization_2.this,);
    }

}
