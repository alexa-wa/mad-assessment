package com.example.madassessment.dataEntities;

public class PointOfInterestEntity {

    private String name;
    private String type;
    private Double price;

    public PointOfInterestEntity(String[] values){
        this(values[0], values[1], Double.parseDouble(values[2]));
    }

    public PointOfInterestEntity(String name, String type, Double price) {
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

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        String magicString = this.name + "," + this.type + "," + this.price;
        return magicString;
    }

}
