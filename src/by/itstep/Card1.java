package by.itstep;

import java.util.Scanner;

public class Card1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = 0 ;
        if (x <= -20){
            y = 3 * Math.pow(x,3);
        }
        else {
            if (x > -20 && x <=30){
                y = Math.abs(x);
            }
            else {
                y = 30;
            }
        }
        System.out.println(y);
    }
}
