package com.example.ujjawal_pc.symptomchecker;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

public class skinnext extends AppCompatActivity {
    ExternalDatabaseHelper db;
    private Cursor cursor;
    TextView t1,t2,t3,t4;
    public static ArrayList<Model> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skinnext);
        Intent intent = getIntent();
        String id = intent.getStringExtra("One");
        db = new ExternalDatabaseHelper(this);
        ArrayList<Model> contacts = new ArrayList<Model>();
        contacts = getAllRecords(id);
        t1 = (TextView) findViewById(R.id.text1);
        t2 = (TextView) findViewById(R.id.text2);
        t3 = (TextView) findViewById(R.id.text3);
        t4 = (TextView) findViewById(R.id.text4);
        for (int i = 0; i < contacts.size(); i++) {
            t1.setText(t1.getText()+ " " + contacts.get(i).getFirstName() );
            t2.setText(t2.getText()+ " " + contacts.get(i).getLastName());
            t3.setText(t3.getText()+ " " + contacts.get(i).getDrug() );
            t4.setText(t4.getText()+ " " + contacts.get(i).getDoctor());
        }
    }

    /**
     *
     * @param symp
     * @return Method will return all Records
     */
    public ArrayList<Model> getAllRecords(String symp) {
        db = new ExternalDatabaseHelper(this);
        try {
            db.createDataBase();
            db.openDataBase();
        } catch (Exception e) {
            e.printStackTrace();}
        String id = symp;
        SQLiteDatabase sd = db.getReadableDatabase();
        Cursor cursor = sd.rawQuery("select * from Skin where symptom='" + id + "'", null);
        ArrayList<Model> contacts = new ArrayList<Model>();
        Model contactModel;
        if(cursor.getCount() > 0 ){
            if (cursor.moveToFirst()) {
                while (!cursor.isAfterLast()) {
                    String symptom = cursor.getString(cursor.getColumnIndex("symptom"));
                    String disease = cursor.getString(cursor.getColumnIndex("disease"));
                    String drug = cursor.getString(cursor.getColumnIndex("drug"));
                    String doctor = cursor.getString(cursor.getColumnIndex("doctor"));
                    contacts.add(new Model(symptom,disease,drug,doctor));
                    cursor.moveToNext();
                }
            }
        }
        return contacts;
    }
}