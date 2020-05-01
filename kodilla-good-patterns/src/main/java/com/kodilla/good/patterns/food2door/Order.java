package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private Suplier suplier;
    private Purchaser purchaser;
    private LocalDate orderDate;
    private Map<String, Integer> orderList;
    private int orderNumber = 1;

    public Suplier getSuplier() {
        return suplier;
    }

    public Purchaser getPurchaser() {
        return purchaser;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void increaseOrderNumber() {
        orderNumber++;
    }

    public Order(Suplier suplier, Purchaser purchaser, LocalDate orderDate, Map<String, Integer> orderList) {
        this.suplier = suplier;
        this.purchaser = purchaser;
        this.orderDate = orderDate;
        this.orderList = orderList;
    }

    public Map<String, Integer> addProductsToOrder(Suplier suplier, Order order) {
        Map<String, Integer> listToProcess = new HashMap<>();
        for (String product : orderList.keySet()) {
            if (suplier.getProducts().containsKey(product)) {
                listToProcess.put(product, orderList.get(product));
            }
        }
        System.out.println("Lista do zamówienia: " + listToProcess);
        return listToProcess;
    }
}