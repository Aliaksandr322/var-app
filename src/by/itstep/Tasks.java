package by.itstep;

import java.util.Scanner;

public class Tasks {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Input first side of triangle:");
        int firstSideOFTriangle = sc.nextInt();
        System.out.println("Input second side of triangle:");
        int secondSideOFTriangle = sc.nextInt();
        System.out.println("Input third side of triangle:");
        int thirdSideOFTrangle = sc.nextInt();
        Triangle tr = new Triangle(firstSideOFTriangle,secondSideOFTriangle,thirdSideOFTrangle);
        */
        String str = sc.nextLine();
        if (str.equals("Triangle")){
            triangle();
        }
        else if (str.equals("Square")){
            square();
        }
        else if (str.equals("Circle")){
            circle();
        }
        else System.out.println("Такой фигуры нет");
    }

    /*public static void task2(){
        System.out.println("Task 2 begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A :");
        int a = sc.nextInt();
        System.out.println("Input B :");
        int b = sc.nextInt();
        System.out.println("Input C :");
        int c = sc.nextInt();

        System.out.println("Result: " + (a + "*x*x + " + b +"*x + " + c + " = 0"));

        int D = b * b - (4 * a * c);
        System.out.println("D is " + D);
        if (D > 0){
            double dis = Math.sqrt(D);
            double x1 = (-b + dis)/(2 * a);
            System.out.println("Первый корень: " + x1);
            double x2 = (-b - dis)/(2 * a);
            System.out.println("Второй корень: " + x2);
        }
        else if (D == 0){
            double dis = Math.sqrt(D);
            double x1 = (-b + dis)/(2 * a);
            System.out.println("Корень уравнения : " + x1);
        }
        else {
            System.out.println("Корней нет.");
        }

    }
    */
    public static void triangle(){
        System.out.println("Triangle begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first side A :");
        int a = sc.nextInt();
        System.out.println("Input second side B :");
        int b = sc.nextInt();
        System.out.println("Input third side C");
        int c = sc.nextInt();

        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        if (a < bc && b < ac && c < ab){
            System.out.println("This is a triangle.");
             double P = a + b + c;
             double p = P/2;
             double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Perimeter of triangle: " + P);
            System.out.println("Area of triangle: " + S);
        }
        else {
            System.out.println("This isn't a triangle");
        }
    }
    public static void square(){
        System.out.println("Square begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first side A :");
        int a = sc.nextInt();
        System.out.println("Input second side B :");
        int b = sc.nextInt();
        if (a == b){
            System.out.println("It is a square");
            int P = 4*a;
            int S = a*a;
            System.out.println("Area: " + S);
            System.out.println("Perimeter: " + P);
        }
        else {
            System.out.println("It is a rectangle");
            int P = 2*a + 2*b;
            int S = a*b;
            System.out.println("Area: " + S);
            System.out.println("Perimeter: " + P);
        }
    }
    public static void circle(){
        System.out.println("Circle begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius of circle :");
        int R = sc.nextInt();
        final double PI = 3.14;
        System.out.println("Diameter of circle: " + 2 * R);
        System.out.println("Area of circle: " + PI * R * R);
        System.out.println("Perimeter of circle: " + 2 * PI * R);

    }

    public static void runSomeTask(){
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first side A :");
        int num = sc.nextInt();
        if (num == 1){
            circle();
        }
        else if (num == 2){
            triangle();
        }
        else if (num == 3){
            square();
        }
        else {
            System.out.println("Error");
        }
    }
}
