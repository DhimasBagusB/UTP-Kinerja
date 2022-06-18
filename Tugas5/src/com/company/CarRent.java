package com.company;

public class CarRent {
    private int rentDur;
    private Car car;
    private CarRider rider;

    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rentDur = rentDur;
        this.car = car;
        this.rider = rider;
    }

    public int getRentDur() {
        return rentDur;
    }

    public void setRentDur(int rentDur) {
        this.rentDur = rentDur;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarRider getRider() {
        return rider;
    }

    public void setRider(CarRider rider) {
        this.rider = rider;
    }
}
