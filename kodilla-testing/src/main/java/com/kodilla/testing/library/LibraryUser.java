package com.kodilla.testing.library;

import java.util.List;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselId;
    List<Book> borrowedBooks;

    public LibraryUser(String firstname, String lastname, String peselId, List<Book> borrowedBooks) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
        this.borrowedBooks = borrowedBooks;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;

        if (!firstname.equals(that.firstname)) return false;
        if (!lastname.equals(that.lastname)) return false;
        return peselId.equals(that.peselId);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + peselId.hashCode();
        return result;
    }
}
