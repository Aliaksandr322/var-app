package oop.init;

import oop.inh.animals.Test;

public class test {
    /* Порядок инициализации в джава

    */
    int val;
    static {
        System.out.println("Test static block.");
    }
    test (){
        System.out.println("Test constructor");
        System.out.println(val);
    }
    public static void main(String[] args) {
//        new Third();
//
//        double pi = Math.PI;
        new test();
        new Parent();
        /*System.out.println(Parent.getpStatic());*/
    }

}
