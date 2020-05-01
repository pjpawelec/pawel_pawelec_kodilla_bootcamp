package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Map<String, Integer> suplier1Products = new HashMap<>();
        suplier1Products.put("Apple", 500);
        suplier1Products.put("Orange", 1000);
        suplier1Products.put("Pear", 250);

        Map<String, Integer> suplier2Products = new HashMap<>();
        suplier1Products.put("Carrot", 400);
        suplier1Products.put("Beetroot", 280);
        suplier1Products.put("Onion", 200);

        Map<String, Integer> suplier3Products = new HashMap<>();
        suplier1Products.put("Eggs", 15000);
        suplier1Products.put("Butter", 270);
        suplier1Products.put("Cheese", 170);


        Suplier suplier1 = new Suplier("ExtraFoodShop", suplier1Products);
        Suplier suplier2 = new Suplier("HealthyShop", suplier2Products);
        Suplier suplier3 = new Suplier("GlutenFreeShop", suplier3Products);

        Purchaser purchaser1 = new Purchaser("Jan", "Nowak", "jn@jn.pl");

        Map<String, Integer> odrerList1 = new HashMap<>();
        odrerList1.put("Apple", 5);
        odrerList1.put("Orange", 3);

        Order order1 = new Order(suplier1, purchaser1, LocalDate.of(2020, 5, 1), odrerList1);

        Process process = new Process();
        process.process(suplier1, purchaser1, order1);
    }
}
