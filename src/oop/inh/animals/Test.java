package oop.inh.animals;

import oop.Person;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Corgi corgi = new Corgi();
        Person person = new Person();

        corgi.setPerson(person);

        dog1.setName("Bob");
        dog1.setId(01);
        dog2.setName("Racks");
        dog2.setId(02);

        dog1.play();
        dog1.eat();
        dog1.sleep();
        dog1.voice();
        dog1.serve();

        dog2.play();
        dog2.eat();
        dog2.sleep();
        dog2.voice();
        dog2.serve();

        cat1.setId(03);
        cat1.setName("Mia");
        cat2.setId(04);
        cat2.setName("Lia");

        cat1.play();
        cat1.eat();
        cat1.sleep();
        cat1.voice();

        cat2.play();
        cat2.eat();
        cat2.sleep();
        cat2.voice();
    }
}
