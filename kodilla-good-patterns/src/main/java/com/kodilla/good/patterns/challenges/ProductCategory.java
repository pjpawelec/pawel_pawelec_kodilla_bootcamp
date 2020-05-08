package com.kodilla.good.patterns.challenges;

public class ProductCategory {
    private String CategoryName;
    private int CategoryNumber;

    public ProductCategory(String categoryName, int categoryNumber) {
        CategoryName = categoryName;
        CategoryNumber = categoryNumber;
    }

    @Override
    public String toString() {
        return CategoryName;
    }
}
