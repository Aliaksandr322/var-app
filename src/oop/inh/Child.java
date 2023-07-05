package oop.inh;

// Класс Child  расширяет(наследует) класс Parent
public class Child extends Parent{

    private int iq;


    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void jump(){
        System.out.println("Jumping " + getName());
    }

    // Переопределение способность изменить функционал ,который был в базовом классе.
    @Override
    public void sayMyName(){
        // super - это ссылка на супер класс.
        super.sayMyName();
        System.out.println("My name is " + getName());
    }

}
