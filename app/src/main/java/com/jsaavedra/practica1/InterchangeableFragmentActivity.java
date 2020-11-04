package com.jsaavedra.practica1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// below API 14 {FragmentClassname}.OnFragmentInteractionListener
public class InterchangeableFragmentActivity extends AppCompatActivity implements View.OnClickListener{

    FragmentBlue fragmentBlue;
    FragmentRed fragmentRed;

    Button btnBlueSelector;
    Button btnRedSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interchangeable_fragment);

        fragmentBlue = new FragmentBlue();
        fragmentRed = new FragmentRed();

        btnRedSelector = findViewById(R.id.btn_red_fragment_selector);
        btnBlueSelector = findViewById(R.id.btn_blue_fragment_selector);

        btnBlueSelector.setOnClickListener(this);
        btnRedSelector.setOnClickListener(this);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_layout, fragmentBlue).commit();
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (v.getId()){
            case R.id.btn_blue_fragment_selector:
                fragmentTransaction.replace(R.id.fragment_container_layout, fragmentBlue).commit();
                break;
            case R.id.btn_red_fragment_selector:
                fragmentTransaction.replace(R.id.fragment_container_layout, fragmentRed).commit();
                break;
        }
    }
}