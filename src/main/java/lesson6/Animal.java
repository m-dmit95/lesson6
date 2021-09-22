package lesson6;

public class Animal {
    protected String name;
    protected double runLimit;
    protected double swimLimit;
    protected double jumpLimit;

    public Animal() {
    }

    public Animal(String name, double runLimit, double swimLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public void run(double length) {
        if (length <= runLimit) {
            System.out.printf("%s пробежал %.2f метров.%n", name, length);
        } else {
            System.out.printf("%s не может пробежать более %.2f метров!%n", name, runLimit);
        }
    }

    public void swim(double length) {
        if (length <= swimLimit) {
            System.out.printf("%s проплыл %.2f метров.%n", name, length);
        } else {
            System.out.printf("%s не может проплыть более %.2f метров!%n", name, swimLimit);
        }
    }

    public void jump(double height) {
        if (height <= jumpLimit) {
            System.out.printf("%s прыгнул на %.2f метров.%n", name, height);
        } else {
            System.out.printf("%s не может прыгнуть больше, чем на %.2f метров!%n", name, jumpLimit);
        }
    }
}
