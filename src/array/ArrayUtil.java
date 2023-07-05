package array;

import math.Util;

public class ArrayUtil {

    public static void printArray(int[] array){
        for (int index = 0; index < array.length; index++){
            System.out.println("array[" + index +"] = " + array[index] );
        }
    }
    public static void printArrayInLine(int[] array){
        System.out.print("arr ={");
        for (int index = 0; index < array.length; index++){
            if (index == array.length - 1){
                System.out.print(index);
            }
            else System.out.print( array[index] + ", " );
        }
        System.out.print("}\n");
    }
    public static int printArrayMaxValue (int[] array){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxValue) maxValue = array[i];
        }
        return maxValue;
    }
    public static int printArrayMinValue (int[] array){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < minValue) minValue = array[i];
        }
        return minValue;
    }
    public static int[] printArrayMinValue (int a){
        int [] array = new int[a];
        for (int i = 0; i < array.length ; i++){
            array[i] = (int)(Math.random() * 101);
        }
        return array;
    }
    public static int[] randomArr(int maxBound){
        Util util = new Util();
        int l = util.genRandom(maxBound);
        int[] array = new int[l];
        for (int i = 0; i < array.length; i++){
            array[i] = util.genRandom(0,100);
        }
        return array;
    }


    public static void main(String[] args) {

        int[] array = randomArr(10);

        for (int i = 0; i < array.length; i++ ){
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println("Min value is " + printArrayMinValue(array));
        System.out.println("Max value is " + printArrayMaxValue(array));



//        int arr[] = printArrayMinValue(5);
//        printArray(arr);
//        printArrayInLine(arr);
//        System.out.println(printArrayMaxValue(arr));
//        System.out.println(printArrayMinValue(arr));

//        // Arrays declaration
//
//        // single dimension
//        int arr[];
//        int[] arr2;
//
//        // double dimension
//        int [][] arr3;
//        int[] arr4[];
//        int arr5[][];
//        // multiply dimension
//        int[][] arr6[];
//
//        // Array initialisation
//
//                        //0 1 2
//        int [] arr10 = {1, 2, 3};
//
//                            //  0  1  2  3  4
//                            // {0, 0, 0, 0, 0}
//        int [] arr11 = new int[5];
//        arr = new int[]{12, 2};
//
//        //size
//        int arr100Size = arr10.length;
//        System.out.println(arr100Size);
//
//        //Get element from array
//        int val = arr10[2];
//        System.out.println(val);
//
//
//        // SET ELEMENT
//        int[] arr1000 = new int[100];
//        arr1000[0] = 10;
//        arr1000[1] = Integer.MIN_VALUE;
//        arr1000[arr1000.length - 1] = (int)(Math.random() * 101);
//        System.out.println(arr1000[arr1000.length - 1]);
//
//        int a[] = new int[5];
//        a[0] = 22;
//        a[1] = 123;
//        a[2] = 43;
//        a[3] = 413;
//        a[4] = 0;
//
//        int[] aCopy = new int[a.length + 3];
//        for (int i = 0; i < a.length ; i++){
//            aCopy[i] = a[i];
//            aCopy[5] += aCopy[i];
//        }
////        System.out.println(aCopy[2]);
////        System.out.println(aCopy[5]);
////        for (int i = 0; i < aCopy.length ; i++){
////            System.out.println(aCopy[i]);
////        }

    }
}
