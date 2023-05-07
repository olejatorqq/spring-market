package com.example.springmarket.models;

public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    private String city;
    private String author;

    public Product(int id, String name, String description, int price, String city, String author) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.city = city;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
