package com.kodilla.stream.book;

public final class Book {
    private final String title;
    private final String author;
    private final int yearOfPoblication;
    private final String signature;

    public Book(String title, String author, int yearOfPoblication, String signature) {
        this.title = title;
        this.author = author;
        this.yearOfPoblication = yearOfPoblication;
        this.signature = signature;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPoblication() {
        return yearOfPoblication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPoblication=" + yearOfPoblication +
                ", signature='" + signature + '\'' +
                '}';
    }
}


