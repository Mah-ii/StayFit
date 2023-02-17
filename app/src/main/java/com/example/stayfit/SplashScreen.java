package com.example.stayfit;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private TextView appname;
    Animation up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        appname=(TextView) findViewById(R.id.appname);


        up= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        appname.setAnimation(up);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        },3500);

    }
}