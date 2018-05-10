package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

public class detect2 extends AppCompatActivity {
    TextView tv;
    Button bhead,bmale,bmental,beyes,bskin,bfemale,bnose,babdomen,bbuttock,bchest,bneck,blegs,bback,barms,bphysical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect2);

        bhead=(Button)findViewById(R.id.button1);
        bmale=(Button)findViewById(R.id.button10);
        bmental=(Button)findViewById(R.id.button14);
        beyes=(Button)findViewById(R.id.button2);
        bskin=(Button)findViewById(R.id.button13);
        bfemale=(Button)findViewById(R.id.button9);
        bnose=(Button)findViewById(R.id.button3);
        babdomen=(Button)findViewById(R.id.button7);
        bbuttock=(Button)findViewById(R.id.button11);
        bchest=(Button)findViewById(R.id.button4);
        bneck=(Button)findViewById(R.id.button8);
        blegs=(Button)findViewById(R.id.button12);
        bback=(Button)findViewById(R.id.button5);
        barms=(Button)findViewById(R.id.button6);
        bphysical=(Button)findViewById(R.id.button15);
        tv = (TextView) findViewById(R.id.textView19);
        tv.setText("Welcome , " + getIntent().getExtras().getString("One"));
    }
    public void head(View v) {
        Intent intent2 = new Intent();
        intent2.setClass(this,head.class);
        startActivity(intent2);
    }
    public void male(View v) {
        Intent intent1 = new Intent();
        intent1.setClass(this,male.class);
        startActivity(intent1);
    }
    public void mental(View v) {
        Intent intent3 = new Intent();
        intent3.setClass(this,mental.class);
        startActivity(intent3);
    }
    public void eyes(View v) {
        Intent intent4 = new Intent();
        intent4.setClass(this,eyes.class);
        startActivity(intent4);
    }
    public void skin(View v) {
        Intent intent5 = new Intent();
        intent5.setClass(this,skin.class);
        startActivity(intent5);
    }
    public void female(View v) {
        Intent intent6 = new Intent();
        intent6.setClass(this,female.class);
        startActivity(intent6);
    }
    public void nose(View v) {
        Intent intent7 = new Intent();
        intent7.setClass(this,nose.class);
        startActivity(intent7);
    }
    public void abdomen(View v) {
        Intent intent8 = new Intent();
        intent8.setClass(this,abdomen.class);
        startActivity(intent8);
    }
    public void buttock(View v) {
        Intent intent9 = new Intent();
        intent9.setClass(this,buttock.class);
        startActivity(intent9);
    }
    public void chest(View v) {
        Intent intent10 = new Intent();
        intent10.setClass(this,chest.class);
        startActivity(intent10);
    }
    public void neck(View v) {
        Intent intent11 = new Intent();
        intent11.setClass(this,neck.class);
        startActivity(intent11);
    }
    public void legs(View v) {
        Intent intent12 = new Intent();
        intent12.setClass(this,legs.class);
        startActivity(intent12);
    }
    public void back(View v) {
        Intent intent13 = new Intent();
        intent13.setClass(this,back.class);
        startActivity(intent13);
    }
    public void arms(View v) {
        Intent intent14 = new Intent();
        intent14.setClass(this,arms.class);
        startActivity(intent14);
    }
    public void physical(View v) {
        Intent intent15 = new Intent();
        intent15.setClass(this,physical.class);
        startActivity(intent15);
    }

}

