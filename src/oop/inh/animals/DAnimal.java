package oop.inh.animals;

import oop.Person;

public class DAnimal extends Animal{

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    private Person person;



    void sleep(){
        System.out.println(getName() + " is sleeping...");
    }
    void eat(){
        System.out.println(getName() + " eat() -> Milk");
    }
    void play(){
        System.out.println(getName() + "play()");
    }
    void voice(){
        System.out.println("some voice");
    }
}
