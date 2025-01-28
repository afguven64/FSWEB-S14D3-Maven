package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine() {
        return "the car engine is starting...";
    }
    public String drive() {
        return runEngine();
    }
    protected String runEngine() {
        return "Running ";
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
