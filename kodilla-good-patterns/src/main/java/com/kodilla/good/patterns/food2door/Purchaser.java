package com.kodilla.good.patterns.food2door;

public class Purchaser {
    private String name;
    private String surname;
    private String mail;

    public Purchaser(String name, String surname, String mail) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }
}
