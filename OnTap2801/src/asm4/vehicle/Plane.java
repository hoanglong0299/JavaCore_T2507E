package asm4.vehicle;

public class Plane extends Vehicle{
    public Plane(String name,Integer maxSpeed ) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(getName() + "("+getMaxSpeed() + "km/h) => Plane is flying");
    }
}
