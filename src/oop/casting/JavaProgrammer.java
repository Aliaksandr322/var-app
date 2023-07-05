package oop.casting;

public abstract class JavaProgrammer {

    abstract void makeCode();

    public void playTennis() {
        System.out.println("Playing Tennis...");
    }

}

class MiddleJavaDeveloper extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write some good code here.");
        playTennis();
    }
    void drinkCoffee(){
        System.out.println("I am drinking coffee.");
    }
}

class SeniorJavaDeveloper extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write some perfect code here.");
        playTennis();
    }

    void leaveOffice(){
        System.out.println("Leave office.");
    }
}
class JuniorJavaDeveloper extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write some normal code here.");
    }

    void lear(){
        System.out.println("Study.");
    }
}

class Company{
    public static void main(String[] args) {
        JuniorJavaDeveloper junior = new JuniorJavaDeveloper();
        JavaProgrammer programmer = (JavaProgrammer) junior; // upcasting

        Object obj =(Object) new SeniorJavaDeveloper();// upcasting
        Object obj2 = (Object) (JavaProgrammer) new MiddleJavaDeveloper();// upcasting

        JavaProgrammer jp = new JuniorJavaDeveloper(); // new SeniorJavaDeveloper();
        if (jp instanceof SeniorJavaDeveloper) {
            SeniorJavaDeveloper senior = (SeniorJavaDeveloper) jp; // downcasting
            senior.leaveOffice();
        }else if (jp.getClass() == JuniorJavaDeveloper.class){
            JuniorJavaDeveloper jun = (JuniorJavaDeveloper) jp; // downcasting
            jun.lear();
        }

        JavaProgrammer [] programmers = {jp, (JavaProgrammer) obj, (JavaProgrammer) obj2,jp};
        System.out.println("programmers : " + programmers.length);

        for (JavaProgrammer programmer1 : programmers){
            programmer1.makeCode();
        }

    }
}