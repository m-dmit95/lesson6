package lesson6.animals;

import lesson6.Animal;

public class Dog extends Animal {
    protected String type;

    public Dog(String name, double runLimit, double swimLimit, double jumpLimit, String type) {
        super(name, runLimit, swimLimit, jumpLimit);
        this.type = type;
    }
}
