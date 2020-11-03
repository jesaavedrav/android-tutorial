package com.jsaavedra.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button nextActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextActivityButton = findViewById(R.id.nextActivityButton);
        // 2nd way to listen a Button
        nextActivityButton.setOnClickListener(this);

        // 1st way to listen to Button
//        nextActivityButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Click", "Next activity clicked");
//            }
//        });


    }

    // 2nd way to listen a Button
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.nextActivityButton:
                Log.d("Click", "Next activity clicked from interface");
                Intent nextActivityIntent = new Intent(this, SecondActivity.class);
                nextActivityIntent.putExtra("stringName", "this is a String");
                nextActivityIntent.putExtra("integerName", 654);
                startActivity(nextActivityIntent);
                break;
        }
    }
}