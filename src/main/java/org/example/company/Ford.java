package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders,String name ) {
        super(cylinders, name);    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "Ford Engine";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "Ford accelerate";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "Ford brake";
    }
}
