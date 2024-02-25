package com.mycompany.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<CountryInfo> countryinfo = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryinfo.add(new CountryInfo(R.drawable.bangladesh,"Bangladesh","This is the Bangladesh Flag"));
        countryinfo.add(new CountryInfo(R.drawable.usa,"USA","This is the United states of America Flag"));
        countryinfo.add(new CountryInfo(R.drawable.canada,"Canada","This is the Canada Flag"));
        countryinfo.add(new CountryInfo(R.drawable.bangladesh,"Bangladesh","This is the Bangladesh Flag"));
        countryinfo.add(new CountryInfo(R.drawable.usa,"Usa","This is the Bangladesh Flag"));
        countryinfo.add(new CountryInfo(R.drawable.canada,"Canada","This is the Bangladesh Flag"));
        countryinfo.add(new CountryInfo(R.drawable.bangladesh,"Bangladesh","This is the Bangladesh Flag"));
        countryinfo.add(new CountryInfo(R.drawable.usa,"USA","This is the Bangladesh Flag"));
        countryinfo.add(new CountryInfo(R.drawable.canada,"Canada","This is the Bangladesh Flag"));
        countryinfo.add(new CountryInfo(R.drawable.bangladesh,"Bangladesh","This is the Bangladesh Flag"));

        RecyclerCountryAdapter adapter = new RecyclerCountryAdapter(this, countryinfo);
        recyclerView.setAdapter(adapter);


    }
}