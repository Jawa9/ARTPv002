package com.learn.neko.artp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityDoNotTouch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_not_touch);
    }
    public void nuOk(View v){
        Intent intent = new Intent(this,ActivityZb.class);
        startActivity(intent);
    }
}
