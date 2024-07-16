
public class Car extends Vehicle{
    String make = "AA";
    String model ="BB";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    String name;

    void drive(){
        System.out.println("You are driving the car");
    }

    void brake(){
        System.out.println("You step on the brake");
    }

    public void go(){
        System.out.println("Driving...");
    }

    public String toString(){
        String myString = make + "\n" + model + "\n" + color;
        return myString;
    }

    // Car(String name){
    //     this.name = name;
    // }

}