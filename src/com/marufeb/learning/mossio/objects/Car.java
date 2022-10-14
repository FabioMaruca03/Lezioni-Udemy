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
    }

    @Override
    public String toString() {
        return super.toString() +
                "Car{" +
                "wheelNumber=" + wheelNumber +
                ", targa='" + targa + '\'' +
                '}';
    }
}
