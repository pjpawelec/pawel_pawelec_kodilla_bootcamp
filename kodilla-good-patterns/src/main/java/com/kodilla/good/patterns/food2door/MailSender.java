package com.kodilla.good.patterns.food2door;

public class MailSender {
    private Purchaser purchaser;

    MailSender(Purchaser purchaser) {
        this.purchaser = purchaser;
    }

    public static void sendMail(Purchaser purhaser) {
        System.out.println("Mail wysłany na adres: " + purhaser.getMail());
    }
}
