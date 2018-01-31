package com.example.lottieanim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LottieAnimationView lottieLike = (LottieAnimationView) findViewById(R.id.lottie_likeanim);

        lottieLike.playAnimation();
    }
}
