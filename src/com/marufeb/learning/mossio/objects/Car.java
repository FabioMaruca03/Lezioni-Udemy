package com.marufeb.learning.mossio.objects;

public class Car extends Vehicle {
    public static final String V = "";

    public Car(String targa) {
        super(4, targa);
    }

    public static void main(String[] args) {
        final Car car = new Car( "TARGA");
        final String v = Car.V; // CHIAMATA A VARIABILE STATICA
        final String s = String.valueOf(2); // Chiamata a con metodo statico
        final int wheelNumber1 = car.wheelNumber;
        final int wheelNumber2 = car.getWheelNumber();
        Vehicle vehicle = new Vehicle(1, "") {
            @Override
            public void drive() {

            }
        };
        Car car1 = new Car();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Car{" +
                "wheelNumber=" + wheelNumber +
                ", targa='" + targa + '\'' +
                '}';
    }

    @Override
    public void drive() {

    }
}
