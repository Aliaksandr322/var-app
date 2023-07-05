package by.itstep;

import java.util.Scanner;

public class IfTester {
    public static void main(String[] args) {
        System.out.println("Begin");
        Scanner sc = new Scanner(System.in);
        int t = -30 ;
        /*if(<condition>){<body>}, where condition can be TRUE or FALSE!
          if condition is TRUE -> Body
         */
        if (t > 20){
            System.out.println("Shirt");
        }
        if (t < -15){
            System.out.println("Coat");
        }

        int m1 = 3, m2 = 7, m3 = 9, m4 = 8, m5 = 6;
        double result = (m1 + m2 + m3 + m4 + m5)/5.0;
        System.out.println("AVG = " + result);

        if (result >= 9){
            System.out.println("=)");
        }else if (result >= 6){
            System.out.println("=|");
        }else {
            System.out.println("=(");
        }

        /*int a = 7;
        int b = 2;
        int c = 6;
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        if (ab > c && ac > b && bc > a){
            System.out.println("Valid triangle");
        }
        else {
            System.out.println("Invalid triangle");
        }
        */
        int a = 10;
        int b = 10;
        int c = 5;
        if (a >= b && a >= c){
            System.out.println("a is the biggest");
        }else if (b >= a && b >= c) {
            System.out.println("b is the biggest");
        }else System.out.println("c is the biggest");





        System.out.println("End.");
    }
}
