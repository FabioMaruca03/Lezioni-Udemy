package com.marufeb.learning.mossio;

import com.marufeb.learning.mossio.objects.Car;

public class Launcher {
    public static void main(String[] args) {
        final Car car = new Car( "TARGA");
        System.out.println(car); // To string chiamato in automatico
        System.out.println();
        car.setTarga("TARGA - 1");
        System.out.println(car);
    }
}
