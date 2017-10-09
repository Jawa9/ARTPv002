package com.learn.neko.artp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivitySomebodyKnow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somebody_know);
    }
    public void daKnow(View v){
        Intent intent = new Intent(this,ActivitySvalit.class);
        startActivity(intent);
    }
    public void noKnow (View v){
        Intent intent = new Intent(this,ActivityZb.class);
        startActivity(intent);
    }
}
