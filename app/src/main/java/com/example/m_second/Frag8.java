package com.example.m_second;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Frag8 extends Fragment {


    private Button btn, btn2;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag8_fragment, container, false);

        btn = view.findViewById(R.id.bt8_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("STATE", "success INTERNET");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.genesis.com/kr/ko/luxury-sedan-genesis-g80-specifications.html"));
                startActivity(intent);}
        });

        btn2 = view.findViewById(R.id.bt8_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.kia.com/kr/vehicles/k9/specification.html"));
                startActivity(intent);
            }
        });

        return view;
    }




}
