package com.example.ujjawal_pc.symptomchecker;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class disease extends AppCompatActivity {
        private static RecyclerView.Adapter adapter;
        private RecyclerView.LayoutManager layoutManager;
        private static RecyclerView recyclerView;
        public static ArrayList<DictObjectModel1> data;
        ExternalDatabaseHelper db ;
        ArrayList<String> wordcombimelist;
        ArrayList<String> meancombimelist;
        LinkedHashMap<String,String> namelist;
        SearchView searchView;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_disease);
            recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view1);
            recyclerView.setHasFixedSize(true);
            db= new ExternalDatabaseHelper(this);
            searchView = (SearchView) findViewById(R.id.searchView1);
            searchView.setQueryHint("Search Here");
            searchView.setQueryRefinementEnabled(true);
            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            data = new ArrayList<DictObjectModel1>();
            fetchData();

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {return  false; }

                @Override
                public boolean onQueryTextChange(String newText) {


                    newText = newText.toLowerCase();

                    final ArrayList<DictObjectModel1> filteredList = new ArrayList<DictObjectModel1>();

                    for (int i = 0; i < wordcombimelist.size(); i++) {

                        final String text = wordcombimelist.get(i).toLowerCase();
                        if (text.contains(newText)) {

                            filteredList.add(new DictObjectModel1(wordcombimelist.get(i),meancombimelist.get(i)));
                        }
                    }
                    adapter = new CustomAdapter1(filteredList);
                    recyclerView.setAdapter(adapter);


                    return true;
                }
            });


        }
        public void fetchData()
        {
            db =new ExternalDatabaseHelper(this);
            try {

                db.createDataBase();
                db.openDataBase();

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }


            namelist=new LinkedHashMap<>();
            int ii;
            SQLiteDatabase sd = db.getReadableDatabase();
            Cursor cursor = sd.query ("disease" ,null, null, null, null, null, null);
            ii=cursor.getColumnIndex("name");
            wordcombimelist=new ArrayList<String>();
            meancombimelist= new ArrayList<String>();
            while (cursor.moveToNext()){
                namelist.put(cursor.getString(ii), cursor.getString(cursor.getColumnIndex("info")));
            }
            Iterator entries = namelist.entrySet().iterator();
            while (entries.hasNext()) {
                Map.Entry thisEntry = (Map.Entry) entries.next();
                wordcombimelist.add(String.valueOf(thisEntry.getKey()));
                meancombimelist.add("- "+String.valueOf(thisEntry.getValue()));
            }

            for (int i = 0; i < wordcombimelist.size(); i++) {
                data.add(new DictObjectModel1(wordcombimelist.get(i), meancombimelist.get(i)));
            }
            adapter = new CustomAdapter1(data);
            recyclerView.setAdapter(adapter);
        }
}




