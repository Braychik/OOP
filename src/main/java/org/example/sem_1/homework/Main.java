package org.example.sem_1.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Category category1 = new Category("Мебель");
        category1.addProduct(new Product("Диван", 10000,5));
        category1.addProduct(new Product("Кресло", 5000, 4));
        Category category2 = new Category("Электроника");
        category2.addProduct(new Product("Ноутбук", 35000, 5));
        category2.addProduct(new Product("Смартфон", 15000, 4));
        shop.addCategory(category1);
        shop.addCategory(category2);
        shop.printCatalog();
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        user1.getBasket().addProduct(category1.getProducts().get(0));
        user2.getBasket().addProduct(category2.getProducts().get(1));
        System.out.println("Покупки");
        ArrayList<Product> user1Products = user1.getBasket().getProducts();
        for (Product product : user1Products) {
            System.out.println(product.getName() + " - " + product.getPrice() + " - " + product.getRating());
        }        System.out.println("Покупки");
        ArrayList<Product> user2Products = user2.getBasket().getProducts();
        for (Product product : user2Products) {
            System.out.println(product.getName() + " - " + product.getPrice() + " - " + product.getRating());
        }
    }

}
