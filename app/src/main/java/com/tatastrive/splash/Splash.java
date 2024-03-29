package com.tatastrive.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Splash.this,MainActivity.class);
                //intent is used to switch from one activity to another

                startActivity(i);
                //invoke the Main activity

                finish();
                //current activity will get finished
            }
        },SPLASH_SCREEN_TIME_OUT);
    }
}
