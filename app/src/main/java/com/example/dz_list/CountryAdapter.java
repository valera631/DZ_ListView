package com.example.dz_list;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
public class CountryAdapter extends ArrayAdapter<Country> {
    private Context context;
    private List<Country> countries;

    public CountryAdapter(Context context, List<Country> countries) {
        super(context, R.layout.item, countries);
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item, parent, false);

        ImageView flagImageView = view.findViewById(R.id.flag);
        TextView countryTextView = view.findViewById(R.id.country);

        Country country = countries.get(position);

        flagImageView.setImageResource(country.getFlagId());
        countryTextView.setText(country.getName());

        return view;
    }
}
