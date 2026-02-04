package asm4.vehicle;

public class Train extends Vehicle{
    public Train(String name,Integer maxSpeed ) {
        super(name, maxSpeed);
    }
    @Override
    public void move() {
        System.out.println(getName() + "("+getMaxSpeed() + "km/h) => Train is running");
    }
}
