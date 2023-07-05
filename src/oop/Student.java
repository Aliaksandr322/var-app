package oop;

public class Student {

    private String name;
    private double avg;

    // has - a - relationship(Есть отношение) у студента есть университет
    private University university;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
class University{
    private String name;
    private String location;
    private int numberOfStudents;

    // has - a - relationship
    private Teacher[] teachers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}

class Teacher{
    private String name;
    private int exp;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Test{
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.setName("John");
        teacher1.setSalary(2000);
        teacher1.setExp(5);

        Teacher teacher2 = new Teacher();
        teacher2.setName("Mike");
        teacher2.setSalary(3500);
        teacher2.setExp(10);

        Teacher[] teachers = {teacher1,teacher1};


        University university = new University();
        university.setLocation("Minsk");
        university.setName("BSUIR");
        university.setNumberOfStudents(1500);
        university.setTeachers(teachers);


        Student student = new Student();
        student.setAvg(5.8);
        student.setUniversity(university);
        student.setName("Vitaly");
    }
}