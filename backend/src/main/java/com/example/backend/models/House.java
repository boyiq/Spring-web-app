package com.example.backend.models;

public class House {
    private int id;
    private String city;
    private int price;

    public int getId() {
        return this.id;
    }

    public String getCity() {
        return city;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int newID) {
        this.id = newID;
    }
}
