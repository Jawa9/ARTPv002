package com.learn.neko.artp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_login);
    }

    public void onLogin(View v){

        TextView textView = (TextView)findViewById(R.id.textView);
        TextView nick = (TextView)findViewById(R.id.nick);

        if(nick.getText().toString().equals("")){
            textView.setText("Вы немного забыли ввести ник. Введите его пжл.");
        }else {

            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}
