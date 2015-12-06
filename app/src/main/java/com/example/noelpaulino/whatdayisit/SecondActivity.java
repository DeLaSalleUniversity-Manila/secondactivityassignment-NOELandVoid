package com.example.noelpaulino.whatdayisit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Noel Paulino on 12/6/2015.
 */
public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        handleIntent();
    }

    private void handleIntent(){
        Intent i = getIntent();
        String day_out = i.getStringExtra("message");
        TextView tv_out = (TextView) findViewById(R.id.textViewOut);
        tv_out.setText(day_out);
    }

}