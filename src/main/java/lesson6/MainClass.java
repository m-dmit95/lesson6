package lesson6;

import lesson6.animals.Dog;
import lesson6.animals.Cat;

public class MainClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Зверь", 400, 200, 2);
        Dog dog1 = new Dog("Шарик", 500, 300, (float) 0.5, "Терьер");
        Cat cat1 = new Cat("Мурзик", 300, (float) 0.5, "Рыжий");

        Animal[] animals = new Animal[10];
        Dog[] dogs = new Dog[10];
        Cat[] cats = new Cat[10];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animal("animal" + i, (int) (Math.random() * 500), (int) (Math.random() * 500), (int) (Math.random() * 2));
            dogs[i] = new Dog("dog" + i, (int) (Math.random() * 700), (int) (Math.random() * 500), (float) (Math.random() * 2), "type" + i);
            cats[i] = new Cat("cat" + i, (int) (Math.random() * 700), (float) (Math.random() * 2.5), "color" + i);
        }

        System.out.println("---------");
        for (Animal animal : animals) {
            animal.run((int) (Math.random() * 600));
            animal.swim((int) (Math.random() * 600));
            animal.jump((float) (Math.random() * 3));
        }
        System.out.println("---------");
        for (Dog dog : dogs) {
            dog.run((int) (Math.random() * 600));
            dog.swim((int) (Math.random() * 600));
            dog.jump((float) (Math.random() * 3));
        }
        System.out.println("---------");
        for (Cat cat : cats) {
            cat.run((int) (Math.random() * 600));
            cat.swim((int) (Math.random() * 600));
            cat.jump((float) (Math.random() * 3));
        }
        System.out.println("---------");


//        тест
        System.out.println("---------");
        Animal myanimal1 = new Animal("энимал", 200, 100, 5);
//        Cat myanimal2 = new Animal("животне", 300, 200, 3); - не взлетит, потому что нельзя присваивать
//            экземпляр родительского класса в переменную c типом дочернего класса
        Animal mycat1 = new Cat("кошк", 300, 2, "белый");
        Cat mycat2 = new Cat("кошккошк", 300, 2, "белый");

        myanimal1.swim(100);
        mycat1.swim(100);
        mycat2.swim(100);
//        mycat1.meow(); не взлетит без приведения к типу Cat
        ((Cat) mycat1).meow();
        mycat2.meow();
        System.out.println("---------");

    }
}
