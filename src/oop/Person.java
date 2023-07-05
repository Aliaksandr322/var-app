package oop;

// Class <=> Model <=> Type <=> Template (Класс(тип) опрделяет будующие характеристики и функционал конкрутных объектов)
public class Person {

    // field - поля. Характеристики будующего объекта
    int age;
    String name;
    String lastName;
    char gender; // can be 'f' , 'm'
    boolean isSingle;
    public static int num;

    private Cat cat;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }




    //method <=> functions. (Поведение будующих объектов)
    void sayMyName(){
        System.out.println("Hello, my name is " + this.name);
    }

    void dance(){
        System.out.println(this.name + " is dancing");
    }

    void drink(){
        if (this.age >= 18){
            System.out.println("Vine or/and beer");
        }
        else System.out.println("Water, only water");
    }

}

class Tester {
    public static void main(String[] args) {

        // Создаение переменной типа person
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        // instant creation <=> object creation. С посмощью оператора new создаем объек в памяти



        // instant fields initialisation <=> object populating
        person.name = "Ivan";
        person.age = 18;
        person.lastName = "Ivanov";
        person.isSingle = true;
        person.gender = 'm';

        Cat cat = new Cat();
        cat.setName("TOM");


        person.setCat(cat);
        //        person.catName = "Barsik";
        System.out.println(person.getCat().getName());
        // object behavior <=> method invocation
//        person.sayMyName();
//        person.drink();
//        person.dance();
//
//        person1.name = "David";
//        person1.age = 20;
//        person1.lastName = "Davidov";
//        person1.isSingle = true;
//        person1.gender = 'm';
//
//        // object behavior <=> method invocation
//        person1.sayMyName();
//        person1.drink();
//        person1.dance();
//
//        person2.name = "Ira";
//        person2.age = 40;
//        person2.lastName = "Ibrahimova";
//        person2.isSingle = true;
//        person2.gender = 'f';
//
//        // object behavior <=> method invocation
//        person.sayMyName();
//        person.drink();
//        person.dance();
//
//        Person[] arrayPerson = new Person[Person.num];
//        arrayPerson[0] = person;
//        arrayPerson[1] = person1;
//        arrayPerson[2] = person2;
//
//        System.out.println();
//        for (int i = 0; i < arrayPerson.length ; i++){
//            System.out.println("My name is " + arrayPerson[i].name);
//        }
    }
}