package com.learn.neko.artp;

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
    public void daMain(View v){
        Intent intent = new Intent(this,ActivityDoNotTouch.class);
        startActivity(intent);
    }
    public void noMain(View v){
        Intent intent = new Intent(this,ActivityBad.class);
        startActivity(intent);
    }
}
