package com.marufeb.learning.mossio.objects;

public class Vehicle {
    protected final int wheelNumber;
    protected String targa;

    public Vehicle(int wheelNumber, String targa) {
        this.wheelNumber = wheelNumber;
        this.targa = targa;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheelNumber=" + wheelNumber +
                ", targa='" + targa + '\'' +
                "}\n";
    }
}
