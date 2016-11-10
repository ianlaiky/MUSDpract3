package com.nyp.sit.dit.it2107.mysuperhero;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   ListView spLocations;
    ArrayAdapter<CharSequence> adapter;
    TextView superHeroTV;
    String[] strArray;
    String[] superHeros = {"1. BatMan\n2 . SpiderMan","1. Peter Pan\n2. SuperMan",
    "1. IronMan\n2. Peter Pan", "1. SnowWhite\n2. Gingerbreadman"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        superHeroTV = (TextView) findViewById(R.id.superHerosTV);
        spLocations = (ListView) findViewById(R.id.spLocations);


        Resources myRes = this.getResources();
        strArray = myRes.getStringArray(R.array.locationArea);

        adapter= ArrayAdapter.createFromResource(this,R.array.locationArea, android.
        R.layout.simple_spinner_dropdown_item);
        spLocations.setAdapter(adapter);

//        spLocations.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                String text = superHeros[position];
//                superHeroTV.setText(text);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//                superHeroTV.setText("There is no super Heroes for this area. ");
//
//            }
//        });


        spLocations.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = superHeros[position];
                superHeroTV.setText(text);


            }
        });



    }
}
