package com.example.dz_list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DetailsViewModel extends ViewModel {

    private MutableLiveData<Country> selectedCountryLiveData = new MutableLiveData<>();

    public void setSelectedCountry(Country country) {
        selectedCountryLiveData.setValue(country);
    }

    public LiveData<Country> getSelectedCountry() {
        return selectedCountryLiveData;
    }
}
