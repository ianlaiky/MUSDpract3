package com.nyp.sit.dit.it2107.mysuperhero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spLocations;
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
        spLocations = (Spinner) findViewById(R.id.spLocations);

    }
}
