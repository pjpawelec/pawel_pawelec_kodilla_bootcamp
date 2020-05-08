package com.kodilla.good.patterns.challenges;

public class Product {
    private ProductCategory CategoryAffiliation;
    private String ProductName;
    private double ProductPrice;

    public Product(ProductCategory categoryAffiliation, String productName, double productPrice) {
        CategoryAffiliation = categoryAffiliation;
        ProductName = productName;
        ProductPrice = productPrice;
    }

    public ProductCategory getCategoryAffiliation() {
        return CategoryAffiliation;
    }

    public String getProductName() {
        return ProductName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    @Override
    public String toString() {
        return ProductName;
    }
}
