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
        countries.add(new Country("США", "https://cdn.pixabay.com/photo/2020/03/30/16/39/america-4984797_640.jpg", "Вашингтон", 12345));
        countries.add(new Country("Канада", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Canada.svg/1280px-Flag_of_Canada.svg.png", "Оттава", 98765));
        countries.add(new Country("Франция", "https://content1.rozetka.com.ua/goods/images/big/16910803.jpg", "Париж", 67890));
        countries.add(new Country("Германия", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/2560px-Flag_of_Germany.svg.png", "Берлин", 54321));
        countries.add(new Country("Италия", "https://static9.depositphotos.com/1006269/1088/i/450/depositphotos_10884967-stock-photo-italian-flag.jpg", "Рим", 45678));
        countries.add(new Country("Япония", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/250px-Flag_of_Japan.svg.png", "Токио", 34567));
        countries.add(new Country("Бразилия", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/250px-Flag_of_Brazil.svg.png", "Бразилиа", 23456));
        countries.add(new Country("Австралия", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/250px-Flag_of_Australia_%28converted%29.svg.png", "Канберра", 87654));
        countries.add(new Country("Индия", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flag_of_India.svg/1200px-Flag_of_India.svg.png", "Нью-Дели", 76543));
        countries.add(new Country("Южная Африка", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Flag_of_South_Africa.svg/640px-Flag_of_South_Africa.svg.png", "Претория", 65432));

        CountryAdapter countryAdapter = new CountryAdapter(this, countries);
        main_list.setAdapter(countryAdapter);


        main_list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Country country = (Country) parent.getItemAtPosition(position);


        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);


        intent.putExtra("flagUrl", country.getFlagUrl());
        intent.putExtra("countryName", country.getName());
        intent.putExtra("capital", country.getCapital());
        intent.putExtra("area", country.getArea());

        // Запуск DetailsActivity
        startActivity(intent);
    }
}
