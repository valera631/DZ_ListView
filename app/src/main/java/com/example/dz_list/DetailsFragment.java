package com.example.dz_list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class DetailsFragment extends Fragment {

    private ImageView flagImageView;
    private TextView countryNameTextView;
    private TextView capitalTextView;
    private TextView areaTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        flagImageView = view.findViewById(R.id.flag_image_view);
        countryNameTextView = view.findViewById(R.id.country_name_text_view);
        capitalTextView = view.findViewById(R.id.capital_text_view);
        areaTextView = view.findViewById(R.id.area_text_view);

        DetailsViewModel detailsViewModel = new ViewModelProvider(requireActivity()).get(DetailsViewModel.class);
        detailsViewModel.getSelectedCountry().observe(getViewLifecycleOwner(), country -> {
            flagImageView.setImageResource(country.getFlagId());
            countryNameTextView.setText(country.getName());
            capitalTextView.setText("Столица: " + country.getCapital());
            areaTextView.setText("Площадь: " + country.getArea());
        });

        return view;
    }
}
