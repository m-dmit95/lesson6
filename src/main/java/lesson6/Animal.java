package lesson6;

public class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected float jumpLimit;

    public Animal() {
    }

    public Animal(String name, int runLimit, int swimLimit, float jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public void run(int length) {
        if (length <= runLimit) {
            System.out.println(name + " пробежал " + length + " метров.");
        } else {
            System.out.println(name + " не может пробежать более " + runLimit + " метров!");
        }
    }

    public void swim(int length) {
        if (length <= swimLimit) {
            System.out.println(name + " проплыл " + length + " метров.");
        } else {
            System.out.println(name + " не может проплыть более " + swimLimit + " метров!");
        }
    }

    public void jump(float height) {
        if (height <= jumpLimit) {
            System.out.println(name + " прыгнул на " + height + " метров.");
        } else {
            System.out.println(name + " не может прыгнуть больше, чем на " + jumpLimit + " метров!");
        }
    }
}
