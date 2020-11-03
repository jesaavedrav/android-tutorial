package com.jsaavedra.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button killActivityStack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        killActivityStack = findViewById(R.id.killActivityStack);
        killActivityStack.setOnClickListener(this);

        Intent secondActivityIntent = getIntent();
        Log.d("String Data:", Objects.requireNonNull(secondActivityIntent.getStringExtra("stringName")));
        Log.d("Integer Data:", String.valueOf(secondActivityIntent.getIntExtra("integerName", 0)));
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.killActivityStack:
                Intent killAllIntent = new Intent(this, MainActivity.class);
                killAllIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(killAllIntent);
                //finishAffinity(); this kills all activities including this one
        }
    }
}