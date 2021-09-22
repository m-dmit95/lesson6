package lesson6.animals;

import lesson6.Animal;

public class Cat extends Animal {
    protected String color;

    public Cat(String name, double runLimit, double jumpLimit, String color) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.color = color;
    }

    @Override
    public void swim(double length) {
        System.out.printf("%s не умеет плавать!%n", name);
    }

    public void meow() {
        System.out.println(name + ": MEOW");
    }
}
