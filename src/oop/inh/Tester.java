package oop.inh;

import oop.Cat;

public class Tester {
    public static void main(String[] args) {
        //'USE' relationship
        Third third = new Third();
        third.setId(100);
        third.setName("John");
        third.setAge(34);
        third.setIq(75);

        //'USE' relationship.
        Cat cat = new Cat();
        System.out.println(cat.toString());
        third.setCat(cat);

        third.sayMyName();
        third.run();
        third.jump();
        System.out.println(third.toString());
    }
}
