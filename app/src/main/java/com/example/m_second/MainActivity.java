package com.example.m_second;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.bt1);
        btn2 = findViewById(R.id.bt2);
        btn3 = findViewById(R.id.bt3);
        btn4 = findViewById(R.id.bt4);
        btn5 = findViewById(R.id.bt5);
        btn6 = findViewById(R.id.bt6);
        btn7 = findViewById(R.id.bt7);
        btn8 = findViewById(R.id.bt8);
        btn9 = findViewById(R.id.bt9);


        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //진
                Vibrator vib = (Vibrator)getSystemService(VIBRATOR_SERVICE);
                vib.vibrate(1300);
                //프래그먼트 호출
                FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
                Frag1 frag1 = new Frag1();
                tran.replace(R.id.main_frame, frag1);
                tran.commit();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
                Frag2 frag2 = new Frag2();
                tran.replace(R.id.main_frame, frag2);
                tran.commit();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
                Frag3 frag3 = new Frag3();
                tran.replace(R.id.main_frame, frag3);
                tran.commit();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
                Frag4 frag4 = new Frag4();
                tran.replace(R.id.main_frame, frag4);
                tran.commit();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
                Frag5 frag5 = new Frag5();
                tran.replace(R.id.main_frame, frag5);
                tran.commit();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
                Frag6 frag6 = new Frag6();
                tran.replace(R.id.main_frame, frag6);
                tran.commit();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
                Frag7 frag7 = new Frag7();
                tran.replace(R.id.main_frame, frag7);
                tran.commit();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
                Frag8 frag8 = new Frag8();
                tran.replace(R.id.main_frame, frag8);
                tran.commit();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
                Frag9 frag9 = new Frag9();
                tran.replace(R.id.main_frame, frag9);
                tran.commit();
            }
        });

    }

}