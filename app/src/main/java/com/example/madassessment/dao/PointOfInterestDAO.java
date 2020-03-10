package com.example.madassessment.dao;

public class PointOfInterestDAO {

    private String name;
    private String type;
    private int price;

    public PointOfInterestDAO(String[] values){
        this(values[0], values[1], Integer.parseInt(values[2]));
    }

    public PointOfInterestDAO(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        String magicString = this.name + "," + this.type + "," + this.price;
        return magicString;
    }

}
