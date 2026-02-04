package asm4.animal;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "Lion eats meat");    }
}
