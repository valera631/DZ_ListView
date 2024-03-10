package com.example.dz_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {

            CountryListFragment countryListFragment = new CountryListFragment();


            FragmentManager fragmentManager = getSupportFragmentManager();


            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


            fragmentTransaction.add(R.id.fragment_container, countryListFragment);


            fragmentTransaction.commit();
    }
}

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
