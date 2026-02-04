package asm4.vehicle;

public class Car extends Vehicle{
    public Car(String name,Integer maxSpeed ) {
        super(name, maxSpeed);
    }
    @Override
    public void move() {
        System.out.println(getName() + "("+getMaxSpeed() + "km/h) => Car is driving");
    }
}
