package While;

import java.util.Scanner;

public class Tester {
    public static void main (String[] args) throws InterruptedException {

//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task1();
        task7();
    }
    public static void task1() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int t = 23;
        final int max = 100; // constant
        System.out.println("Введите нужный объём воды (мл)");
        int V = sc.nextInt();
        if (V >= 200 && V <= 5000) {
            while (t <= max) {
                System.out.println("working...");
                Thread.sleep(500 * (V/1000));
                int x = (int) (Math.random() * 6) + 5;// from 5 to 10
                t += x; // t = t + x;
                System.out.println("Current tmp is " + t);
            }
        }
        else System.out.println("Incorrect V. Min is 0.2l, Max is 5l");
    }
    // 0 2 4 6 8 (1000 times)
    public static void task2(){
        int i = 0;
        int num = 0;
        while (num != 1000){
            System.out.print(i + " ");
            i+=2;
            num++;
        }
        System.out.println();
    }
    public static void task3(){
        int i = 1;
        int num = 0;
        while (num != 500){
            System.out.print(i + " ");
            i+=2;
            num++;
        }
        System.out.println();
    }
    public static void task4(){
        int i = 10;
        int num = 0;
        while (num != 50){
            System.out.print(i + " ");
            i+=10;
            num++;
        }
        System.out.println();
    }
    public static void task5(){
        int i = -1;
        int num = 0;
        while (num != 100){
            System.out.print(i + " ");
            i-=1;
            num++;
        }
        System.out.println();
    }
    public static void task6(){
        int i = -1;
        int j = 2;
        int num = 0;
        while (num != 100){
            System.out.print(i + " " + j + " ");
            i-=1;
            j+=2;
            num++;
        }
        System.out.println();
    }
    public static void task7(){
        int num = 0;
        while (num < 10){
            int j = (int)(Math.random()*13) + 1;
            System.out.print(j + " ");
            num++;
        }
        System.out.println();
    }
}
