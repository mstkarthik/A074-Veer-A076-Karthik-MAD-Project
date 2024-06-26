package com.example.simplisonix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity
{

    private static int SPLASH_LENGTH=500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getActionBar()!=null)
        {
            getActionBar().hide();
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i1=new Intent(MainActivity.this, FirstScreen.class);
                startActivity(i1);
                finish();
            }
        },SPLASH_LENGTH);

    }
}