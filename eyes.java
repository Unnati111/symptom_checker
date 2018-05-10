package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class eyes extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = { "Blurred Vision" ,
            "Dark Circles Under the Eyes" ,
            "Double Vision" ,
            "Dry Eye" ,
            "Eye Discharge" ,
            "Eye Pain" ,
            "Eye Twitch" ,
            "Photophobia" ,
            "Pink Eye" ,
            "Ptosis" ,
            "Swollen Eyes" ,
            "Tunnel Vision" ,
            "Vision Loss" ,
            "Watery Eye","Earache" ,
            "Hearing Loss" ,
            "Ringing in Ears"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyes);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView22);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button37);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(eyes.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);

    }
    }

