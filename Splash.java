package com.example.ujjawal_pc.symptomchecker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Splash extends Activity {
    ImageView image;
    ProgressBar pb;
    int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        image = (ImageView)findViewById(R.id.imageView);
        pb=(ProgressBar)findViewById(R.id.progressBar);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.animation);
        image.startAnimation(animation);


   /* public void fade(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        image.startAnimation(animation1);
      ;*/

        final Intent i = new Intent(this, s1.class);
        Thread timer = new Thread() {
            public void run() {
                for (int j = 0; j < 2; j++) {
                    progress += 50;
                    pb.setProgress(progress);
                    if (progress == pb.getMax()) {
                        startActivity(i);
                        finish();
                    }

                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } //finally {
                        //startActivity(i);
                        //finish();
                    //}
                }
            }
        };
        timer.start();
    }

}