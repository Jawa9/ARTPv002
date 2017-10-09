package com.learn.neko.artp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivitySvalit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svalit);
    }
    public void daSvl(View v){
        Intent intent = new Intent(this,ActivityZb.class);
        startActivity(intent);
    }
    public void noSvl(View v){
        Intent intent = new Intent(this,ActivityPP.class);
        startActivity(intent);
    }
}
