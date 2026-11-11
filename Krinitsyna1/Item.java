package Krinitsyna1;

public class Item {
    private double mass;
    private double volume;

    public Item(double mass, double volume) {
        this.mass = mass;
        this.volume = volume;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensity() {
        return mass / volume;
    }
}
