package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");


        Car car = new Car(4, "Base Car");
        Car ford = new Ford(2, "Ford Car");
        Car holden = new Holden(2, "Holden Car");
        Car mitsubishi = new Mitsubishi(2, "Mitsubishi Car");

        System.out.println(ford.accelerate());
    }


}