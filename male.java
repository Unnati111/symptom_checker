package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class male extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = {"Blood in Semen" ,
            "Blood in Urine" ,
            "Burning Urination" ,
            "Cloudy Urine" ,
            "Dark Urine" ,
            "Frequent Urination" ,
            "Impotence" ,
            "Infertility" ,
            "Penile Itching" ,
            "Swollen Glands" ,
            "Urinary Incontinence" ,
            "Urinary Retention" ,
            "Urine Odor"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView9);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button28);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(male.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);

    }
    }

