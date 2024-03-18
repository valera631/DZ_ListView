package com.example.dz_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity implements CountryAdapter.OnItemClickListener {
    private List<Country> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mainRecyclerView = findViewById(R.id.main_recycler_view);
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        countries = new ArrayList<>();
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
        mainRecyclerView.setAdapter(countryAdapter);
    }

    @Override
    public void onItemClick(int position) {
        // Обработка нажатия на элемент RecyclerView
        Country country = countries.get(position);

        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("flagId", country.getFlagId());
        intent.putExtra("countryName", country.getName());
        intent.putExtra("capital", country.getCapital());
        intent.putExtra("area", country.getArea());

        startActivity(intent);
    }
}
