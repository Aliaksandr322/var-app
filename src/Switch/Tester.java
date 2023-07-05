package Switch;

import java.util.Scanner;

public class Tester {


    public static void main(String[] args) {
//        int num = 1;
//        // switch (var) {body with cases}
//        switch (num){
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            default:
//                System.out.println("Not One and Not Two");

//        task1();
//        task2();
//        task3();
        task4();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of weekday");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tusday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This is not a week day");
        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Вы ввели непривильный месяц");
        }
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input month num:");
        int num = sc.nextInt();
        switch (num) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("It is not a season");
        }
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input letter:");
        char ch = sc.nextLine().charAt(0);
        if (Character.isLetter(ch))  {//(ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)
            System.out.println("Letter");
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'i':
                case 'o':
                case 'e':
                case 'y':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        }
        else System.out.println("Your input is not a letter.");
        }
    }
