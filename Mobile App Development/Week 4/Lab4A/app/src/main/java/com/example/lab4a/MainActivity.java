package com.example.lab4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DetailsFragment df = DetailsFragment.newInstance("0");
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, df).commit();

    }
}