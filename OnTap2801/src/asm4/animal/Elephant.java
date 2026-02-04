package asm4.animal;

public class Elephant extends Animal{
    public Elephant(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName()+ "Elephant eats grass");    }
}
