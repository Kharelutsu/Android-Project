package com.example.utsabkharel.thingsee;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // for the timer
        Handler handler = new Handler();
        handler.postDelayed (new Runnable() {
            @Override
            public void run() {

                if(new User(Main1Activity.this).getNam()!="") {

                    Intent intent = new Intent(Main1Activity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Intent intent = new Intent(Main1Activity.this, Main2Activity.class);
                    startActivity(intent);
                    finish();
                }
            }
        },2500);
    }
}
