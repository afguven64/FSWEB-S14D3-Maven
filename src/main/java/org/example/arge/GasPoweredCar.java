package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double AverageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double AverageKmPerLiter, int cylinders) {
        super(name, description);
        this.AverageKmPerLiter = AverageKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return "GasPoweredCar";
    }

    public double getAverageKmPerLiter() {
        return AverageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}
