package com.example.ujjawal_pc.symptomchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class bmi extends AppCompatActivity {

    EditText weight,heightft,heightinch;
    TextView detail,textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

    }
    public void oncalculate(View v){
        weight=(EditText)findViewById(R.id.editText);
        heightft=(EditText)findViewById(R.id.editText2);
        heightinch=(EditText)findViewById(R.id.editText8);
        textView=(TextView)findViewById(R.id.textView4);
        detail=(TextView)findViewById(R.id.textView19);
        String w1=weight.getText().toString();
        String h1=heightft.getText().toString();
        String h2=heightinch.getText().toString();

        if(w1.length()==0)
        {
            weight.requestFocus();
            weight.setError("FIELD CANNOT BE EMPTY");
        }
        else if(!w1.matches("[0-9 ]+"))
        {
            weight.requestFocus();
            weight.setError("PLZ ENTER NUMERICAL VALUE");
        }
        else if(h1.length()==0)
        {
            heightft.requestFocus();
            heightft.setError("FIELD CANNOT BE EMPTY");
        }
        else if(!h1.matches("[0-9 ]+"))
        {
            heightft.requestFocus();
            heightft.setError("PLZ ENTER NUMERICAL VALUE");
        }
        else if(h2.length()==0){

            heightinch.requestFocus();
            heightinch.setError("PLZ ENTER 0 AS DEFAULT VALUE");
        }
        else if(!h2.matches("[0-9 ]+"))
        {
            heightinch.requestFocus();
            heightinch.setError("PLZ ENTER NUMERICAL VALUE");
        }
        else {
            int w= Integer.parseInt(weight.getText().toString());
            int h= Integer.parseInt(heightft.getText().toString());
            int i=Integer.parseInt(heightinch.getText().toString());
            int inch=h*12+i;
            int mul=inch*inch;
            int a=w*703;
            float result=a/mul;
            textView.setText(String.valueOf(result));
            if (result < 18.5) {
                detail.setText("UNDERWEIGHT");
            }
            else if ( result>18.5&& result < 24.9) {
                detail.setText("NORMAL WEIGHT");
            }
            else if (result>25 && result < 29.9) {
                detail.setText("OVERWEIGHT");
            }
            if (result >= 30) {
                detail.setText("OBESITY");
            }
        }
    }
}
