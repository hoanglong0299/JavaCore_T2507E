package asm4.vehicle;

public class Bike extends Vehicle {
    public Bike(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(getName() + "("+getMaxSpeed() + "km/h) => Bike is riding");
    }
}
