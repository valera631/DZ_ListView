package com.example.dz_list;

public class Country {
    private String name;
    private int flagId;
    private String capital; // Название столицы
    private int area; // Площадь страны


    public Country(String name, int flagId, String capital, int area) {
        this.name = name;
        this.flagId = flagId;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getFlagId() {
        return flagId;
    }

    public String getCapital() {
        return capital;
    }

    public int getArea() {
        return area;
    }
}