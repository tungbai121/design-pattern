package org.example;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats() {

    }

    @Override
    public void setEngine() {

    }

    @Override
    public void setTripComputer() {

    }

    @Override
    public void setGPS() {

    }

    @Override
    public Car getProduct() {
        Car product = this.car;
        this.reset();

        return product;
    }

}
