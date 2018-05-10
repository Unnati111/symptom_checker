package com.example.ujjawal_pc.symptomchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class mental extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button button;
    String[] skin = { "Altered Mental Status" ,
            "Amnesia" ,
            "Anorexia" ,
            "Anxiety" ,
            "Depression" ,
            "Difficulty Concentrating" ,
            "Euphoria" ,
            "Hyperactivity" ,
            "Insomnia" ,
            "Low Libido" ,
            "Memory Loss" ,
            "Paranoia" ,
            "Suicide" ,
            "Vertigo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental);
        auto = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView10);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, skin);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        button = (Button) findViewById(R.id.button29);
    }

    public void search(View v) {
        String val = auto.getText().toString();
        Intent intent = new Intent();
        intent.setClass(mental.this, skinnext.class);
        intent.putExtra("One", val);
        startActivity(intent);

    }
    }

