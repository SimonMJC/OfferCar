package com.example.m_second;

import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
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
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class Frag3 extends Fragment {

private Button btn, btn2;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.frag3_fragment, container, false);

        View view = inflater.inflate(R.layout.frag3_fragment, container, false);

        btn = view.findViewById(R.id.bt3_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("STATE", "success INTERNET");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kia.com/kr/vehicles/all-new-morning/specification.html"));
            startActivity(intent);}
        });

        btn2 = view.findViewById(R.id.bt3_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.chevrolet.co.kr/vehicle/spark-specification.gm"));
                startActivity(intent);
            }
        });

        return view;
    }




}
