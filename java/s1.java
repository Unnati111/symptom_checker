package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class s1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1);
        ImageView bmi=(ImageView)findViewById(R.id.imageView6);
        ImageView detect=(ImageView)findViewById(R.id.imageView5);
        ImageView drug=(ImageView) findViewById(R.id.imageView3);
        ImageView disease=(ImageView) findViewById(R.id.imageView2);
        ImageView doctor=(ImageView) findViewById(R.id.imageView4);
    }
    public void onbmi(View v) {
        Intent intent = new Intent();
        intent.setClass(this, bmi.class);
        startActivity(intent);
    }

    public void ondetect(View v) {
        Intent intent = new Intent();
        intent.setClass(this, detect1.class);
        startActivity(intent);
    }
    public void ondrug(View v) {
        Intent intent = new Intent();
        intent.setClass(this,drug.class);
        startActivity(intent);
    }
    public void ondisease(View v) {
        Intent intent = new Intent();
        intent.setClass(this,disease.class);
        startActivity(intent);
    }
    public void ondoctor(View v) {
        Intent intent = new Intent();
        intent.setClass(this,doctor.class);
        startActivity(intent);
    }
}
