package com.example.izmai.intentfilter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");
        String time = stf.format(new Date(System.currentTimeMillis()));
        TextView tvtime = (TextView) findViewById(R.id.textView2);
        tvtime.setText(time);

    }

}
