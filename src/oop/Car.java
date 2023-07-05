package oop;

import lombok.Data;
import math.Util;


@Data
public class Car {

    String color;
    String model;
    int numOfTheDoor;
    boolean iscCabriolet;
    int yearOfBuilding;
    double coast ;
    int numberOfSeats;

    int numberOfGears;
    int currentGear;

    int maxSpeed;
    int currentSpeed;

    void acceleration() throws InterruptedException {
        while (currentSpeed <= maxSpeed){
            switchGearUp();
            Thread.sleep(500);
            int temp = Util.genRandom(10,40);
            currentSpeed += temp;
            System.out.println("Current speed is " + currentSpeed);
        }
    }

    void switchGearUp(){
        if (numberOfGears > currentGear) {
            currentGear++;
            System.out.println("Current gear Up : " + currentGear);
        }
        else System.out.println("Max gear number is reached");
    }
    void switchGearDown(){
        if (currentGear >= 1) {
            currentGear--;
            System.out.println("Current gear Down : " + currentGear);
        }
        else System.out.println("Min gear number is reached");
    }


}

class Tester1 {
    public static void main(String[] args) throws InterruptedException{
        Car car_1 = new Car();
        Car car_2 = new Car();
        Car car_3 = new Car();

        car_1.maxSpeed = 200;
        car_1.numberOfGears = 6;
        car_1.acceleration();
    }
}