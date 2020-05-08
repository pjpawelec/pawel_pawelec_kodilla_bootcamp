package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    public static void main(String[] args) {

        ProductCategory computers = new ProductCategory("Komputery", 1);
        ProductCategory phones = new ProductCategory("Telefony", 2);
        ProductCategory accsessories = new ProductCategory("Akcesoria", 3);

        Product product1 = new Product(computers, "Dell", 2999.99);
        Product product2 = new Product(computers, "HP", 2599.99);
        Product product3 = new Product(phones, "Samsung", 1999.99);
        Product product4 = new Product(phones, "Apple", 2999.99);
        Product product5 = new Product(accsessories, "Mysz", 59.99);
        Product product6 = new Product(accsessories, "Etui", 99.99);

        User user1 = new User("user123");

        Order order1 = new Order(user1);
        order1.addToOrder(product1);
        order1.addToOrder(product2);
        order1.addToOrder(product6);
        process(order1);
    }

    public static void process(Order order){
        order.realizeOrder();
        System.out.println("Zamawiający: " + order.getUserId());
    }
}
