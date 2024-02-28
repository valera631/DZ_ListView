package com.example.dz_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

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

        int[] flagImages = {
                R.drawable.usa,
                R.drawable.canada,
                R.drawable.france,
                R.drawable.germany,
                R.drawable.italy,
                R.drawable.japan,
                R.drawable.brazill,
                R.drawable.australia,
                R.drawable.india,
                R.drawable.souh_africa,

        };

FlagAdapter flagAdapter = new FlagAdapter(this, country, flagImages);
main_list.setAdapter(flagAdapter);
    }
}
