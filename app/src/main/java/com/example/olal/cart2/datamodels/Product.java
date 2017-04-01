package com.example.olal.cart2.datamodels;

/**
 * Created by olal on 4/1/17.
 */

public class Product {

    public String name;
    public double price;
    public int quantity;
    public String description;

    public Product(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
}
