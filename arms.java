package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class arms extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = {"Joint Pain" ,
            "Shoulder Pain","Shoulders" ,
            "Joint Pain" ,
            "Shoulder Pain" ,
            "Arms" ,
            "Arm Pain" ,
            "Muscle Cramps" ,
            "Tremor" ,
            "Weakness","Elbow Pain" ,
            "Joint Pain","Brittle Nails" ,
            "Cold Fingers" ,
            "Cold Hands" ,
            "Finger Pain" ,
            "Hand Pain" ,
            "Joint Pain" ,
            "Muscle Cramps" ,
            "Nail Discoloration" ,
            "Numbness Fingers" ,
            "Tremor"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView3);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button21);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(arms.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);
    }
}
