package com.example.dz_list;

public class Country {
    private String name;
    private String flagUrl;
    private String capital;
    private int area;


    public Country(String name, String flagUrl, String capital, int area) {
        this.name = name;
        this.flagUrl = flagUrl;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public String getCapital() {
        return capital;
    }

    public int getArea() {
        return area;
    }
}