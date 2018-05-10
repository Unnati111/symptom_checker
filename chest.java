package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class chest extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = {"Breast Discharge",
            "Breast Lumps" ,
            "Breast Pain" ,
            "Chest Pain" ,
            "Chest Pain with Breathing",
            "Cough" ,
            "Coughing Up Blood",
            "Enlarged Heart" ,
            "Heartburn" ,
            "Hyperventilation" ,
            "Palpitations" ,
            "Shortness of Breath"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView21);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button36);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(chest.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);

    }
}

