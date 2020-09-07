package com.example.alif11rpl022019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    Animation logoAnimation,sloganAnimation;
    TextView txtSlogan;
    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Context context;
        logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        sloganAnimation = AnimationUtils.loadAnimation(this, R.anim.slogan_animation);

        txtSlogan = findViewById(R.id.txtSlogan);
        imgLogo = findViewById(R.id.imgLogo);

        txtSlogan.setAnimation(sloganAnimation);
        imgLogo.setAnimation(logoAnimation);

        Thread thread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(3000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreenActivity.this,ControllClass.class));
                    finish();
                }

            }
        };
        thread.start();
    }
}