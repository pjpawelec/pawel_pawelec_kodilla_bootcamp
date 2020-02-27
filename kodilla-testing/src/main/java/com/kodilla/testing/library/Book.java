package com.kodilla.testing.library;

public class Book {
    String title;
    String author;
    int poblicationYear;

    public Book(String title, String author, int poblicationYear) {
        this.title = title;
        this.author = author;
        this.poblicationYear = poblicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPoblicationYear() {
        return poblicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", poblicationYear=" + poblicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (poblicationYear != book.poblicationYear) return false;
        if (!title.equals(book.title)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + poblicationYear;
        return result;
    }
}
