package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class skin extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = {"Bumps On Skin", "Chills", "Turning Blue", "Depigmentation of skin", "Drainage Of Pus", "Dry Skin"
            , "Easy Bruising", "Excessive Sweating", "Fever", "Flaky Scalp", "Hair Loss", "Hot Flashes", "Itch", "Jaundice",
            "Loss of Temperature Sensation", "Pale Skin", "Peeling Skin", "Rash"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView2);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(skin.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);

    }
}


