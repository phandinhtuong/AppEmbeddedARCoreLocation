package com.example.appembeddedarcorelocation;

//import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.appembeddedarcorelocation.ar.ArActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void arCamera(View v){
        startActivity(new Intent(MainActivity.this, ArActivity.class));
    }
}
