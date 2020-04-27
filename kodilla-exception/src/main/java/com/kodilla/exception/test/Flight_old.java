package com.kodilla.exception.test;

public class Flight_old {
    private String departureAirport;
    private String arrivalAirport;

    public Flight_old(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
