package fore;

import java.util.Scanner;

public class ForTester {

    // 0 2 4 6 8 (1000 times)
    public static void task1(){
        for (int i = 0 ,j = 0; j < 1000 ; i+=2, j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 1 3 5 7 (500 times)
    public static void task2(){
        for (int i = 1 , j = 0; j < 500; i+=2 , j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 10 20 30 40 50 (50)
    public static void task3(){
        for (int i = 10 , j = 0; j < 50; i+=10 , j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // -1 -2 -3 -4 -5 (100 times)
    public static void task4(){
        for (int i = -1 , j = 0; j < 100; i-- , j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // -1 2 -3 4 -5 (100 times)
    public static void task5(){
        for (int i = -1 , j = 2 , z = 0; z < 100; i-=2, j+=2, z++){
            System.out.print(i + " " + j + " ");
        }
        System.out.println();
    }

    // -1 2 -3 4 -5 (100 times)
    public static void task6(){
        for (int i = 0, number = 1 ; i < 100 ; i++){
            System.out.print(number % 2 == 0 ? number*(-1) + " " : number + " ");
            number++;
        }
        System.out.println();
    }

    public static void task7(){
        for (int i = 0; i < 25; i++){
            int num = (int)((Math.random() * 11));
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void task8(){
        for (int i = 2; i < 10 ; i++){
            for (int j = 2 ; j < 11 ; j++){
                System.out.println( i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //      0        1           3         2
        //for(<var>;<condition>;<iteration>){<body>}
        // <var> - выполняется один раз
        // <condition> - true/false
        // <iteration> - выполняется каждый раз перед проверкой condition
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
        task7();
        task8();

    }
}
