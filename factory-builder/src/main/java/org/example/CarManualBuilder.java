package org.example;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {

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
    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();

        return product;
    }
}
