package org.example.sem_1.homework;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;

    public Basket(ArrayList<Product> products) {
        this.products = new ArrayList<>();
    }

    public Basket() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
}
