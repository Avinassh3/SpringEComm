package com.lti.project.model;

public class ProductData {
    private String brand;
    private String name;
    private byte[] photo;

    public byte[] getPhoto2() {
        return photo2;
    }

    public void setPhoto2(byte[] photo2) {
        this.photo2 = photo2;
    }

    public ProductData(String brand, String name, byte[] photo, byte[] photo2, double price, int quantity, String description) {
        this.brand = brand;
        this.name = name;
        this.photo = photo;
        this.photo2 = photo2;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    private byte[] photo2;
    private double price;
    private int quantity;
    private String description;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
