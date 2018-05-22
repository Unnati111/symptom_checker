package com.example.ujjawal_pc.symptomchecker;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class detect1 extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button button;
    String[] gender ={"Male","Female","Other"};
    EditText text1,text2,text3,text4,text5;
    AutoCompleteTextView text6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect1);
        openHelper=new InternalDatabaseHelper(this);
        button=(Button)findViewById(R.id.button7);
        text1=(EditText)findViewById(R.id.editText3);
        text2=(EditText)findViewById(R.id.editText4);
        text3=(EditText)findViewById(R.id.editText5);
        text4=(EditText)findViewById(R.id.editText6);
        text5=(EditText)findViewById(R.id.editText7);
        text6=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.select_dialog_item,gender);
        text6.setThreshold(1);
        text6.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                db=openHelper.getWritableDatabase();
                String fname=text1.getText().toString();
                String lname=text2.getText().toString();
                String height=text3.getText().toString();
                String weight=text4.getText().toString();
                String age=text5.getText().toString();
                String g=text6.getText().toString();
                if(fname.length()==0)
                {
                    text1.requestFocus();
                    text1.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!fname.matches("[a-zA-Z ]+"))
                {
                    text1.requestFocus();
                    text1.setError("ENTER ONLY ALPHABETICAL CHARACTER");
                }
                else if(lname.length()==0)
                {
                    text2.requestFocus();
                    text2.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!lname.matches("[a-zA-Z ]+"))
                {
                    text2.requestFocus();
                    text2.setError("ENTER ONLY ALPHABETICAL CHARACTER");
                }
                else if(height.length()==0)
                {
                    text3.requestFocus();
                    text3.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!height.matches("[0-9 ]+"))
                {
                    text3.requestFocus();
                    text3.setError("ENTER ONLY NUMERICAL VALUE");
                }
                else if(weight.length()==0)
                {
                    text4.requestFocus();
                    text4.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!weight.matches("[0-9 ]+"))
                {
                    text4.requestFocus();
                    text4.setError("ENTER ONLY NUMERICAL VALUE");
                }
                else if(age.length()==0)
                {
                    text5.requestFocus();
                    text5.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!age.matches("[0-9 ]+"))
                {
                    text5.requestFocus();
                    text5.setError("ENTER ONLY NUMERICAL VALUE");
                }
                else if(g.length()==0)
                {
                    text6.requestFocus();
                    text6.setError("FIELD CANNOT BE EMPTY");
                }
                else {
                    insertdata(fname, lname, height, weight, age, g);
                    Toast.makeText(getApplicationContext(), "details saved successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(detect1.this, detect2.class);
                    intent.putExtra("One",fname);
                    startActivity(intent);
                }
            }
        });
    }
    public void insertdata( String fname, String lname, String height, String weight, String age, String g){
        ContentValues contentValues=new ContentValues();
        contentValues.put(InternalDatabaseHelper.COL_2,fname);
        contentValues.put(InternalDatabaseHelper.COL_3,lname);
        contentValues.put(InternalDatabaseHelper.COL_4,height);
        contentValues.put(InternalDatabaseHelper.COL_5,weight);
        contentValues.put(InternalDatabaseHelper.COL_6,age);
        contentValues.put(InternalDatabaseHelper.COL_7,g);
        long id=db.insert(InternalDatabaseHelper.TABLE_NAME,null,contentValues);
    }
}
