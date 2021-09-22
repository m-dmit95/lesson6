package lesson6.animals;

import lesson6.Animal;

public class Cat extends Animal {
    protected String color;

    public Cat(String name, int runLimit, float jumpLimit, String color) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.color = color;
    }

    @Override
    public void swim(int length) {
        System.out.println(name + " не умеет плавать!");
    }

    public void meow() {
        System.out.println(name + ": MEOW");
    }
}
