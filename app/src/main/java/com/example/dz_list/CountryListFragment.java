package com.example.dz_list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class CountryListFragment extends Fragment {

    private ListView listView;
    private List<Country> countries;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_country_list, container, false);

        listView = view.findViewById(R.id.country_list_view);

        // Создаем список стран
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

        // Создаем адаптер для списка стран
        CountryAdapter countryAdapter = new CountryAdapter(requireActivity(), countries);

        // Устанавливаем адаптер для ListView
        listView.setAdapter(countryAdapter);

        // Устанавливаем слушатель для кликов на элементах списка
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Country selectedCountry = countries.get(position);


                Bundle bundle = new Bundle();
                bundle.putInt("flagId", selectedCountry.getFlagId());
                bundle.putString("countryName", selectedCountry.getName());
                bundle.putString("capital", selectedCountry.getCapital());
                bundle.putInt("area", selectedCountry.getArea());


                DetailsFragment detailsFragment = new DetailsFragment();
                detailsFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, detailsFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}
