package com.example.agricare;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreen extends AppCompatActivity {
    private static final int SPLASH_DISPLAY_LENGTH = 3000; // Duration for splash screen in milliseconds (3 seconds)
    ImageView imageView;
    Animation topAnimation, botAnimation;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView2);
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        botAnimation = AnimationUtils.loadAnimation(this,R.anim.bot_anim);

        imageView.setAnimation(topAnimation);
        textView.setAnimation(botAnimation);


        // Delay for SPLASH_DISPLAY_LENGTH and then move to LoginActivity

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }, 3000);

    }
}