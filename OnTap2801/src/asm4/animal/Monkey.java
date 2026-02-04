package asm4.animal;

public class Monkey extends Animal{
    public Monkey(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName()+ "Monkey eats banana");    }
}
