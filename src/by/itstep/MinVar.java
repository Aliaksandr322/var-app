package by.itstep;

public class MinVar {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int a = 10;
        int b = 2;
        int c = 0;

        if (a < b) {
            min = a;
            if (c < a){
                min = c;
                System.out.println("Min var is " + c);
            }
            else System.out.println("Min var is " + a);

        }
        else {
            min = b;
            if (c < b){
                min = c;
                System.out.println("Min var is " + c);
            }
            else System.out.println("Min var is " + b);
        }
    }
}
