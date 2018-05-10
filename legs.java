package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class legs extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = { "Hips" ,
            "Hip Pain" ,
            "Joint Pain","Leg Pain" ,
            "Leg Swelling" ,
            "Muscle Cramps" ,
            "Restless Leg Syndrome" ,
            "Tremor" ,
            "Unsteady Gait" ,
            "Weakness","Ankle Pain" ,
            "Brittle Nails" ,
            "Cold Feet" ,
            "Foot Pain" ,
            "Heel Pain" ,
            "Joint Pain" ,
            "Muscle Cramps" ,
            "Nail Discoloration" ,
            "Numb Toes" ,
            "Swollen Ankles" ,
            "Swollen Feet" ,
            "Tremor"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView8);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button27);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(legs.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);

    }
    }
