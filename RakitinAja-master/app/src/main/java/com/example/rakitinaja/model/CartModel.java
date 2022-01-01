package com.example.rakitinaja.model;

public class CartModel {

    String Price, Product, Time;

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public CartModel(String price, String product, String time) {
        Price = price;
        Product = product;
        Time = time;
    }

    public CartModel(){}
}
