package com.learn.neko.artp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityZb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zb);
    }

    public void onStart(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
