package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class back extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = { "Back Pain" ,
            "Chronic Pain" ,
            "Paralysis"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView4);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button22);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(back.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);
    }
}
