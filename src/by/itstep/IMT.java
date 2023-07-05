package by.itstep;

import java.util.Scanner;

public class IMT {
    public static void main(String[] args) {
        if (index() < 16){
            System.out.println("Дефицит массы тела");
        }
        else if (index() > 16 && index() <= 25){
            System.out.println("Норма");
        }
        else if (index() >= 30 && index() <= 35 ){
            System.out.println();
        }
    }
    public static double index(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите масса: ");
        double weight = sc.nextInt();
        System.out.print("Введите рост: ");
        double height = sc.nextDouble();
        return weight/(Math.pow(height,2));
    }
}
