package oop.inh.animals;

public class Corgi extends Dog {
    private double height;
    private double weight;

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void eat() {
        System.out.println(getName() + " eat() -> bones");
    }

    @Override
    void play() {
        System.out.println(getName() + " is playing with bone");
    }

    @Override
    void voice() {
        System.out.println("Gav - rrrr");
    }

    void serve(){
        System.out.println(getName() + " is serving");
    }
}
