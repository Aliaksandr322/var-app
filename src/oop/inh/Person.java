package oop.inh;

public class Person {

    //Конструкторы никогда ничего не возвращают
    //Constructor - единсивенный способ создать объект
    public Person(){
//        System.out.println("First");
            // Вызов существующего конструктора в этом классе.
            // Вызов конструктора должен быть в первой инсрукции(в первом лайне)
        this(0,"Stranger");
    }
    //Конструктор ,который инициализирет поля.
    public Person(int id, String name, String lastName, char gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }
    public Person(int id, String name) {
        this(id,name,null,' ');
    }

    private int id;
    private String name;
    private String lastName;
    private char gender;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setId(1);
//        person.setGender('m');
//        person.setLastName("Ivanov");
//        person.setName("Ivan");
//        System.out.println(person);
//
//        Employee employee = new Employee();
//        employee.setId(2);
//        employee.setGender('f');
//        employee.setName("Irina");
//        employee.setLastName("Abramenko");
//        employee.setSalary(1500);
//        System.out.println(employee);
//
//        Person person1 = new Person(3,"Alex","Tyson",'m');
//        System.out.println(person1);
//
//        Person person2 = new Person();
//        System.out.println(person2);

        Employee employee1 = new Employee(3421,"Alex","Ivanov",'m',9199894);
        System.out.println(employee1);

        Student student = new Student(123,"Bob","Bobski",'m',8.2);
        System.out.println(student);
        Student student1 = new Student();
        System.out.println(student1);
    }
}
