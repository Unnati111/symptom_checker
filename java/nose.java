package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class nose extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = { "Bloody Nose" ,
            "Runny Nose","Abnormal Taste" ,
            "Bad Breath" ,
            "Bleeding Gums" ,
            "Blood in Spit" ,
            "Difficulty With Speech" ,
            "Drooling" ,
            "Dry Mouth" ,
            "Dysphagia" ,
            "Hairy Tongue" ,
            "Jaw Pain" ,
            "Loss of Taste Sensation" ,
            "Lump or Mass on Gums" ,
            "Mouth Sores" ,
            "Painful Gums" ,
            "Snoring" ,
            "Sore Tongue" ,
            "Swollen Lip" ,
            "Swollen Tongue" ,
            "Tingling Tongue" ,
            "Toothache" ,
            "Vocal Outbursts" ,
            "Vomiting" ,
            "White Tongue"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView13);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button31);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(nose.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);

    }
    }

