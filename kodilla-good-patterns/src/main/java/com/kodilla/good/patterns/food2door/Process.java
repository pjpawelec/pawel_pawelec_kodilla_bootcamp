package com.kodilla.good.patterns.food2door;

public class Process {

    public void process(Suplier suplier, Purchaser purchaser, Order order) {
        System.out.println("Utworzono zamówienie nr: " + order.getOrderNumber());
        order.increaseOrderNumber();
        System.out.println("Data zamówienia: " + order.getOrderDate());
        if (suplier.process(suplier, purchaser) == true) {
            order.addProductsToOrder(suplier, order);
            MailSender.sendMail(purchaser);
            System.out.println("Zamówienie zrealiozwano z sukcesem!");
        }
    }
}
