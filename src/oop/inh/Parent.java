package oop.inh;

import oop.Cat;

// 'IS - A' - relationship. Когда наследник есть родитель
public class Parent {

    // 'Has - A' relationship.
    private Cat cat;

    private String name;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayMyName(){
        System.out.println("My name is " + name);
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
