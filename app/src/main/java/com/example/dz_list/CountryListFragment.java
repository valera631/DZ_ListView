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
import androidx.lifecycle.ViewModelProvider;

import java.util.List;

public class CountryListFragment extends Fragment {

    private ListView listView;
    private CountriesViewModel countriesViewModel;
    private DetailsViewModel detailsViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_country_list, container, false);

        listView = view.findViewById(R.id.country_list_view);

        countriesViewModel = new ViewModelProvider(requireActivity()).get(CountriesViewModel.class);
        countriesViewModel.getCountries().observe(getViewLifecycleOwner(), countries -> {
            CountryAdapter countryAdapter = new CountryAdapter(requireActivity(), countries);
            listView.setAdapter(countryAdapter);
        });

        // Получаем экземпляр DetailsViewModel из того же ViewModelProvider
        detailsViewModel = new ViewModelProvider(requireActivity()).get(DetailsViewModel.class);

        listView.setOnItemClickListener((parent, view1, position, id) -> {
            Country selectedCountry = (Country) parent.getItemAtPosition(position);
            // Устанавливаем выбранную страну в DetailsViewModel
            detailsViewModel.setSelectedCountry(selectedCountry);

            // Создаем экземпляр DetailsFragment
            DetailsFragment detailsFragment = new DetailsFragment();

            // Заменяем текущий фрагмент на DetailsFragment
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, detailsFragment)
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}
