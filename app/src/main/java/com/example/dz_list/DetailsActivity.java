package com.example.dz_list;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        int flagId = getIntent().getIntExtra("flagId", 0);
        String countryName = getIntent().getStringExtra("countryName");
        String capital = getIntent().getStringExtra("capital");
        int area = getIntent().getIntExtra("area", 0);

        ImageView flagImageView = findViewById(R.id.flagImageView);
        TextView countryNameTextView = findViewById(R.id.countryNameTextView);
        TextView capitalTextView = findViewById(R.id.capitalTextView);
        TextView areaTextView = findViewById(R.id.areaTextView);

        flagImageView.setImageResource(flagId);
        countryNameTextView.setText(countryName);
        capitalTextView.setText("Столица: " + capital);
        areaTextView.setText("Площадь: " + area + " км²");
    }
    }

