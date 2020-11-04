package com.jsaavedra.practica1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentBlue extends Fragment {

    private Button buttonAction;
    private View fragmentBlueView;

    public FragmentBlue() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentBlueView = inflater.inflate(R.layout.fragment_blue, container, false);
        buttonAction = fragmentBlueView.findViewById(R.id.button_action_from_fragment);

        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Action from Blue Fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return fragmentBlueView;
    }
}