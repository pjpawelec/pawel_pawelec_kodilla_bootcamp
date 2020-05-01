package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class Suplier {
    private String suplierName;
    private Map<String, Integer> products;

    public Suplier(String suplierName, Map<String, Integer> products) {
        this.suplierName = suplierName;
        this.products = products;
    }

    public String getSuplierName() {
        return suplierName;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public boolean process(Suplier suplier, Purchaser purchaser) {

        System.out.println("Zamówienie zostało złożone przez: " + purchaser.getName() + " " + purchaser.getSurname());
        System.out.println("Zamówienie zostało zrealizowane przez: " + suplier.getSuplierName());
        return true;
    }
}
