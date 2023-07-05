package calcul;


import java.util.Scanner;

public class Calculator {
    // Client
    public static void main(String[] args) {
        //menu();
        randomMethod(2);
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Summa");
            System.out.println("2. Multiply");
            System.out.println("3. Divide");
            System.out.println("4. Subtraction");
            System.out.println("5. Hypotenuse");
            System.out.println("6. Root");
            int methodNumber = sc.nextInt();
            switch (methodNumber) {
                case 1: {
                    System.out.println("Input A: ");
                    int a = sc.nextInt();
                    System.out.println("Input B: ");
                    int b = sc.nextInt();
                    System.out.println("Result is: " + summa(a, b));
                    break;
                }
                case 2: {
                    System.out.println("Input A: ");
                    int a = sc.nextInt();
                    System.out.println("Input B: ");
                    int b = sc.nextInt();
                    System.out.println("Result is: " + multiply(a, b));
                    break;
                }
                case 3: {
                    System.out.println("Input A: ");
                    double a = sc.nextDouble();
                    System.out.println("Input B: ");
                    double b = sc.nextDouble();
                    System.out.println("Result is: " + divide(a, b));
                    break;
                }
                case 4: {
                    System.out.println("Input A: ");
                    int a = sc.nextInt();
                    System.out.println("Input B: ");
                    int b = sc.nextInt();
                    System.out.println("Result is: " + subtraction(a, b));
                    break;
                }
                case 5: {
                    System.out.println("Input A: ");
                    double a = sc.nextDouble();
                    System.out.println("Input B: ");
                    double b = sc.nextDouble();
                    System.out.println("Result is: " + hypotenuse(a, b));
                    break;
                }
                case 6: {
                    System.out.println("Input A: ");
                    double a = sc.nextDouble();
                    System.out.println("Result is: " + rootSqr(a));
                    break;
                }
                default: {
                    System.out.println("Wrong number!");
                    menu();
                }
            }
            System.out.println("Do you want another time ?");
            String str = sc.next();
            if (str.equals("Yes")) {
            }
            else break;
        }
    }

    public static int summa(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("div by zer");
        }
        double result = a / b;
        return result;
    }

    public static int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public static double rootSqr(double a) {
        if (a >= 0) {
            double result = Math.sqrt(a);
            return result;
        } else {
            throw new IllegalArgumentException("negative root");
        }
    }

    public static double distance(double speed, double time) {
        return speed * time;
    }

    public static double hypotenuse(double leg1, double leg2) {
        return rootSqr((Math.pow(leg1, 2) + Math.pow(leg2, 2)));
    }

    public static void randomMethod(int times){
        if (times < 1){
            System.out.println("Wrong number");
        }
        else {
            for (int i = 0; i < times; i++ ){
                int num = (int)((Math.random() * 6) + 1);
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.println("1. Summa");
                    System.out.println("2. Multiply");
                    System.out.println("3. Divide");
                    System.out.println("4. Subtraction");
                    System.out.println("5. Hypotenuse");
                    System.out.println("6. Root");
                    switch (num) {
                        case 1: {
                            System.out.println("Input A: ");
                            int a = sc.nextInt();
                            System.out.println("Input B: ");
                            int b = sc.nextInt();
                            System.out.println("Result is: " + summa(a, b));
                            break;
                        }
                        case 2: {
                            System.out.println("Input A: ");
                            int a = sc.nextInt();
                            System.out.println("Input B: ");
                            int b = sc.nextInt();
                            System.out.println("Result is: " + multiply(a, b));
                            break;
                        }
                        case 3: {
                            System.out.println("Input A: ");
                            double a = sc.nextDouble();
                            System.out.println("Input B: ");
                            double b = sc.nextDouble();
                            System.out.println("Result is: " + divide(a, b));
                            break;
                        }
                        case 4: {
                            System.out.println("Input A: ");
                            int a = sc.nextInt();
                            System.out.println("Input B: ");
                            int b = sc.nextInt();
                            System.out.println("Result is: " + subtraction(a, b));
                            break;
                        }
                        case 5: {
                            System.out.println("Input A: ");
                            double a = sc.nextDouble();
                            System.out.println("Input B: ");
                            double b = sc.nextDouble();
                            System.out.println("Result is: " + hypotenuse(a, b));
                            break;
                        }
                        case 6: {
                            System.out.println("Input A: ");
                            double a = sc.nextDouble();
                            System.out.println("Result is: " + rootSqr(a));
                            break;
                        }
                        default: {
                            System.out.println("Wrong number!");
                        }
                    }
                    System.out.println("Do you want another time ?");
                    String str = sc.next();
                    if (str.equals("Yes")) {
                    }
                    else break;
                }
            }
        }
    }
}


