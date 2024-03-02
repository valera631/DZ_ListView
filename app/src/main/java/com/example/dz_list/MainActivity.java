package com.example.dz_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView main_list = findViewById(R.id.main_list);

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("США", R.drawable.usa, "Вашингтон", 12345));
        countries.add(new Country("Канада", R.drawable.canada, "Оттава", 98765));
        countries.add(new Country("Франция", R.drawable.france, "Париж", 67890));
        countries.add(new Country("Германия", R.drawable.germany, "Берлин", 54321));
        countries.add(new Country("Италия", R.drawable.italy, "Рим", 45678));
        countries.add(new Country("Япония", R.drawable.japan, "Токио", 34567));
        countries.add(new Country("Бразилия", R.drawable.brazill, "Бразилиа", 23456));
        countries.add(new Country("Австралия", R.drawable.australia, "Канберра", 87654));
        countries.add(new Country("Индия", R.drawable.india, "Нью-Дели", 76543));
        countries.add(new Country("Южная Африка", R.drawable.souh_africa, "Претория", 65432));

        CountryAdapter countryAdapter = new CountryAdapter(this, countries);
        main_list.setAdapter(countryAdapter);


        main_list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Country country = (Country) parent.getItemAtPosition(position);


        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);


        intent.putExtra("flagId", country.getFlagId());
        intent.putExtra("countryName", country.getName());
        intent.putExtra("capital", country.getCapital());
        intent.putExtra("area", country.getArea());

        // Запуск DetailsActivity
        startActivity(intent);
    }
}
