package com.learn.neko.artp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityBad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad);
    }

    public void daBad(View v){
        Intent intent = new Intent(this,ActivitySomebodyKnow.class);
        startActivity(intent);
    }
    public void noBad(View v){
        Intent intent = new Intent(this,ActivityRight.class);
        startActivity(intent);
    }
}
