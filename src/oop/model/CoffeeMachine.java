package oop.model;

import java.util.Scanner;

public class CoffeeMachine {

    private final double MAX_WATER_TANK = 2000;// ml
    private final double MAX_COFFEE_TANK = 1000;// ml
    private final double MAX_MILK_TANK = 1000;// ml
    private final double MAX_GARBAGE_TANK = 500;// ml

    private static int salesCounter = 0;
    private String model;
    private int numberOfCups;

    private double waterTank;
    private double coffeeTank;
    private double milkTank;
    private double garbageTank;

    private int currentWaterTemp;

    private boolean isActive;
    private boolean isOn;

    public CoffeeMachine(String model) {
        salesCounter++;
        this.model = model;
    }

    public void switchOn() throws InterruptedException {
        if (!isOn) {
            System.out.println("CoffeeMachine " + model + " is starting...");
            Thread.sleep(1000);
            isOn = true;
            System.out.println("CoffeeMachine " + model + " is started!");
        }
        else System.out.println("Already started!");
    }
    public void switchOff() throws InterruptedException {
        if(isOn){
            System.out.println("CoffeeMachine " + model + " is stopping...");
            Thread.sleep(1000);
            isOn = false;
            System.out.println("CoffeeMachine " + model + " is stopped!");
        }else System.out.println("Already stopped!");
    }

    public void makeCupOfCoffee(){
        if (isOn){
            boolean isTrue = true;
            while (isTrue) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose what kind of coffee do you want ?");
                System.out.println("1.Americano");
                System.out.println("2.Late");
                System.out.println("3.Espresso");
                System.out.println("4.DoubleCoffee");
                int chooseCoffee = scanner.nextInt();
                switch (chooseCoffee) {
                    case 1:
                        if (waterTank >= 100){
                            if (coffeeTank >= 20){
                                if (milkTank >= 50){
                                    System.out.println("Americano is ready!");
                                    waterTank -= 100;
                                    coffeeTank -= 20;
                                    milkTank -= 50;
                                    isTrue = false;
                                }
                                else {
                                    System.out.println("Add 20 ml of milk!");
                                    addMilk(50);
                                }
                            }
                            else {
                                System.out.println("Add 20 ml of coffee!");
                                addCoffee(20);
                            }
                        }
                        else {
                            System.out.println("Add 100 ml of water!");
                            addWater(100);
                        }
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    default:
                        System.out.println("You choose wrong number");
                }
            }




        }
        else System.out.println("Turn on coffee machine");
    }

    public void addWater (int extraWater){
        if ((extraWater + waterTank) >= MAX_WATER_TANK) {
            System.out.println("can't add water");
        }else {
            waterTank += extraWater;
            System.out.println("current water: " + waterTank + " (ml)");
        }
    }

    public void addCoffee (int extraCoffee){
        if ((extraCoffee + coffeeTank) >= MAX_COFFEE_TANK) {
            System.out.println("can't add coffee");
        }else {
            coffeeTank += extraCoffee;
            System.out.println("current coffee: " + coffeeTank + " (ml)");
        }
    }

    public void addMilk (int extraMilk){
        if ((extraMilk + milkTank) >= MAX_MILK_TANK) {
            System.out.println("can't add water");
        }else {
            milkTank += extraMilk;
            System.out.println("current water: " + milkTank + " (ml)");
        }
    }

}
