package oop;

public class Cat {
    private String name;
    private int age;
    private String type;
    private char gender;

    public void eat(){
        System.out.println("I am eating");
    }
    public void sleep(){
        if (random() >= 0 && random() <= 8 && random() >= 22) {
            System.out.println("I am sleeping");
        }
        else System.out.println("I am wake up");
    }
    public void plat(){
        System.out.println("I am playing");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) System.out.println("Incorrect age: " + age);
        else this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public void setGender(char gender){
        if (gender == 'f' || gender == 'm'){
            if (gender == 'f') {
                this.gender = 'f';
            }
            else this.gender = 'm';
        }
        else System.out.println("Incorrect gender: " + gender);
    }

    public char getGender() {
        return gender;
    }

    public int random(){
        int oclock = (int)(Math.random()*25);
        return oclock;
    }
}
class CatTester{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.plat();
        cat.setType("Free");
        System.out.println("Cat type is " + cat.getType());
        cat.setAge(15);
        System.out.println("Cat age is " + cat.getAge());
        cat.setGender('f');
        System.out.println("Cat gender is " + cat.getGender());
        cat.setName("Barsik");
        System.out.println("Cat name is " + cat.getName());
    }
}