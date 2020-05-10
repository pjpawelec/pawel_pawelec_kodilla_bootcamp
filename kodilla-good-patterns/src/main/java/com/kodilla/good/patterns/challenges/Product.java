package com.kodilla.good.patterns.challenges;

public class Product {
    private ProductCategory categoryAffiliation;
    private String productName;
    private double productPrice;

    public Product(ProductCategory categoryAffiliation, String productName, double productPrice) {
        categoryAffiliation = categoryAffiliation;
        productName = productName;
        productPrice = productPrice;
    }

    public ProductCategory getCategoryAffiliation() {
        return categoryAffiliation;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return productName;
    }
}
