package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class abdomen extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = { "Abdominal Pain" ,
            "Gas" ,
            "Increased Appetite" ,
            "Indigestion" ,
            "Loss of Appetite" ,
            "Nausea" ,
            "Stomach Cramps" ,
            "Upset Stomach" ,
            "Vomiting" ,
            "Vomiting Blood" ,
            "Weight Gain" ,
            "Weight Loss"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdomen);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView5);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button23);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(abdomen.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);
    }
}
