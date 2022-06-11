package com.example.scanqrfull;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultne);
        String a = "Text";
        LinearLayout txt, wifi;
        txt = findViewById(R.id.result_note);
        wifi = findViewById(R.id.wifi);
        if(a.equals("Text")){
            txt.setVisibility(View.VISIBLE);
            wifi.setVisibility(View.GONE);
        }else {
            wifi.setVisibility(View.VISIBLE);
            txt.setVisibility(View.GONE);
        }


    }
}