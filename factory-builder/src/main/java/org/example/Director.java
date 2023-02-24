package org.example;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }
}
