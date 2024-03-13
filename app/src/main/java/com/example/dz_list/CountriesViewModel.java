package com.example.dz_list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class CountriesViewModel extends ViewModel {

    private MutableLiveData<List<Country>> countriesLiveData;

    public LiveData<List<Country>> getCountries() {
        if (countriesLiveData == null) {
            countriesLiveData = new MutableLiveData<>();
            loadCountries();
        }
        return countriesLiveData;
    }

    private void loadCountries() {
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
        // Добавьте остальные страны здесь
        countriesLiveData.setValue(countries);
    }
}
