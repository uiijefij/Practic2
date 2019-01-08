package com.example.izmai.intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void onShowTimeClick(View view){
        startActivity(new Intent("com.shiz.android.intent.action.showtime"));
    }
    public  void onShowDateClick(View view){
        startActivity(new Intent("com.shiz.android.intent.action.showdate"));
    }
}
