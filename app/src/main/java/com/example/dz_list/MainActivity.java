package com.example.dz_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView main_list = findViewById(R.id.main_list);

        String[] country = {
                "США",
                "Канада",
                "Франция",
                "Германия",
                "Италия",
                "Япония",
                "Бразилия",
                "Австралия",
                "Индия",
                "Южная Африка"
        };
ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        this,
        android.R.layout.simple_list_item_1,
        country
);
main_list.setAdapter(adapter);
    }
}
