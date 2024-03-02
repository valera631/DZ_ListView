package com.example.dz_list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface CountryAdapte extends ListAdapter, SpinnerAdapter, Filterable, ThemedSpinnerAdapter {
    @NonNull
    @Override
    View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent);

    void onItemClick(AdapterView<?> parent, View view, int position, long id);
}
