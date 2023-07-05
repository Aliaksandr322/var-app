package by.itstep;

public class MaxVar {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int a = 3;
        int b = 8;
        int c = 10;

        if (a > b) {
            max = a;
            if (c > a){
                max = c;
                System.out.println("Max var is " + c);
            }
            else System.out.println("Max var is " + a);
        }
        else {
            max = b;
            if (c > b){
                max = c;
                System.out.println("Max var is " + c);
            }
            else System.out.println("Max var is " + b);
        }
    }
}
