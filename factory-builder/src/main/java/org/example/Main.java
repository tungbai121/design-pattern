package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void makeCar() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);

        CarManualBuilder carManualBuilder = new CarManualBuilder();
    }
}
