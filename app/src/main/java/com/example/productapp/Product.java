package com.example.productapp;

public class Product {
    private String title;
    private String des;
    private float price;
    private int image;

    public Product() {
    }

    public Product(String title, String des, float price, int image) {
        this.title = title;
        this.des = des;
        this.price = price;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
