package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private User userId;
    private List<Product> orderedList = new ArrayList<>();
    private double orderValue;

    public Order(User userId) {
        this.userId = userId;
    }

    public User getUserId() {
        return userId;
    }

    public List<Product> getOrderedList() {
        return orderedList;
    }

    public double getOrderValue() {
        return orderValue;
    }


    public void addToOrder(Product product) {

        orderedList.add(product);
        orderValue += product.getProductPrice();

    }

    public void realizeOrder() {

        System.out.println("Zamówiono produkty: ");
        for(int i=0;i<orderedList.size();i++){
            System.out.println(orderedList.get(i) + " (kategoria: " + orderedList.get(i).getCategoryAffiliation() + ")");
        }
        System.out.println("Wartość zamówienia: " + orderValue);
    }
}
