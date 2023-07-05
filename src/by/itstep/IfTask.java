package by.itstep;

public class IfTask {
    public static void main(String[] args) {
        boolean flag = false;

        int age = 25;
        double cash = 15662.64;
        int IQ = 135;
        if (age <= 30 && cash > 10000 && IQ >= 100){
            flag = true;
        }
        else flag = false;
        System.out.println(flag ? "Yes" : "No");
    }
}
