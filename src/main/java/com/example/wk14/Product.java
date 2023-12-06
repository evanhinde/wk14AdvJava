package com.example.wk14;

public class Product {
    private int id;
    private String title;
    private String description;
    private double price;
    private double rating;
    private int stock;
    private String brand;
    private String[] images;
    //IMAGE DEMO
    //private String[] images

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    public String getBrand() {
        return brand;
    }

    public String[] getImages() {
        return images;
    }
}
