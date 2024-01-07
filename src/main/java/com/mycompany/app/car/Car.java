package com.mycompany.app.car;

import java.util.UUID;

public class Car {

    public enum CarBrand
    {
       BENZ,HONDA,TESLA

    }
    private UUID uuid;
    private CarBrand carBrand;

    private boolean isElectric;

    private boolean isBooked;


    public Car(UUID uuid, CarBrand carBrand, boolean isElectric, boolean isBooked) {
        this.uuid = uuid;
        this.carBrand = carBrand;
        this.isElectric = isElectric;
        this.isBooked = isBooked;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Car{" +
                "uuid=" + uuid +
                ", carBrand=" + carBrand +
                ", isElectric=" + isElectric +
                ", isBooked=" + isBooked +
                '}';
    }
}
