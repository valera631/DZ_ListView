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

public class FlagAdapter extends ArrayAdapter<String> {

   private Context context;
   private String[] country;
    private int[] flagImages;
public FlagAdapter(Context context,String[] country, int[] flagImages){
    super(context, R.layout.item, country);
    this.context = context;
    this.country = country;
    this.flagImages = flagImages;
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item, parent, false);

        ImageView flagImageView = view.findViewById(R.id.flag);
        TextView countryTextView = view.findViewById(R.id.country);

        flagImageView.setImageResource(flagImages[position]);
        countryTextView.setText(country[position]);
    return view;
    }
}
