package com.example.dz_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView main_list = findViewById(R.id.main_list);

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("США", R.drawable.usa));
        countries.add(new Country("Канада", R.drawable.canada));
        countries.add(new Country("Франция", R.drawable.france));
        countries.add(new Country("Германия", R.drawable.germany));
        countries.add(new Country("Италия", R.drawable.italy));
        countries.add(new Country("Япония", R.drawable.japan));
        countries.add(new Country("Бразилия", R.drawable.brazill));
        countries.add(new Country("Австралия", R.drawable.australia));
        countries.add(new Country("Индия", R.drawable.india));
        countries.add(new Country("Южная Африка", R.drawable.souh_africa));


        CountryAdapter countryAdapter = new CountryAdapter(this, countries);
        main_list.setAdapter(countryAdapter);
    }
}
