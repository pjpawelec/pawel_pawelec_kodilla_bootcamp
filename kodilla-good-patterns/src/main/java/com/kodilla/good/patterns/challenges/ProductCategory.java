package com.kodilla.good.patterns.challenges;

public class ProductCategory {
    private String categoryName;
    private int categoryNumber;

    public ProductCategory(String categoryName, int categoryNumber) {
        categoryName = categoryName;
        categoryNumber = categoryNumber;
    }

    @Override
    public String toString() {
        return categoryName;
    }
}
