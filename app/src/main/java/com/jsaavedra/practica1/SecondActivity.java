package com.jsaavedra.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent secondActivityIntent = getIntent();
        Log.d("String Data:", Objects.requireNonNull(secondActivityIntent.getStringExtra("stringName")));
        Log.d("Integer Data:", String.valueOf(secondActivityIntent.getIntExtra("integerName", 0)));
    }
}