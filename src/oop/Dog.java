package oop;

public class Dog {

    private String name;
    private long id;
    private String type;
    private char gender;
    private int age;
    private double w;
    private double h;

    // Getters and setters

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("Incorrect age: " + age);
        }
        else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;

    }
}
class DogTester{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Bob");
        System.out.println("Name is " + d1.getName());
        d1.setAge(-15);
        System.out.println("Age is " + d1.getAge());




    }
}
