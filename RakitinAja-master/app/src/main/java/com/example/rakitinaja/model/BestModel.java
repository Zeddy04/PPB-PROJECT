package com.example.rakitinaja.model;

public class BestModel {

    String title, price;
    Integer imgProduct;

    public BestModel(String title, Integer imgProduct, String price) {
        this.title = title;
        this.imgProduct = imgProduct;
        this.price = price;
    }

    public BestModel() {}

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(Integer imgProduct) {
        this.imgProduct = imgProduct;
    }
}
