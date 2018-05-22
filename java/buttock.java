package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class buttock extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = { "Anal Itching" ,
            "Bleeding" ,
            "Buttock Pain" ,
            "Constipation" ,
            "Diarrhea" ,
            "Stool Color & Texture Changes" ,
            "Tailbone Pain" ,
            "Weight Gain" ,
            "Weight Loss"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttock);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView20);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button35);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(buttock.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);
    }
}
