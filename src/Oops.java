import java.util.InputMismatchException;
import java.util.Scanner;

public class Oops {
    
    public static void main(String[] args) {

        /*String name = "Broo";
        int age = 21;
        hello(name,age);

        int x = 3;
        int y = 5;

        int z = add(x, y);
        System.out.println(add(x, y));
        System.out.println(z);

        System.out.println(add(10, 2));
        System.out.println(add(10, 2 , 14));
        System.out.println(add(10, 2 , 14,7));

        System.out.println(add(10.25, 2.58));
        System.out.println(add(10.00, 2.25 , 14.88));
        System.out.println(add(10.25, 2.25 , 14.58,7.36));

        System.out.printf("This is a format string %d",123);

        boolean mybool = true;
        char mychar = '@';
        String myString = "Broo";
        int myInt = 50;
        double mydouble = 100.00;

        System.out.printf("%b",mybool);
        System.out.printf("%c",mychar);
        System.out.printf("%s",myString);
        System.out.printf("Hello %10s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",mydouble);

        final double pi = 3.14159;
        System.out.println(pi);

        Car mycar = new Car();
        Car mycar2 = new Car();
        System.out.println(mycar.color);
        System.out.println(mycar.make);
        System.out.println(mycar.model);
        System.out.println(mycar.price);
        System.out.println(mycar.year);


        System.out.println(mycar2.color);
        System.out.println(mycar2.make);
        System.out.println(mycar2.model);
        System.out.println(mycar2.price);
        System.out.println(mycar2.year);

        mycar.brake();
        mycar.drive();

        Human human = new Human("John", 69, 70.58);
        Human human2 = new Human("Rick", 69, 70.58);

        System.out.println(human.name);
        human2.eat();
        human.drink();

        diceRoller dc = new diceRoller();

        pizza Pizza = new pizza("thin crust","tomato","mozzerella","jalpaneo");

        System.out.println("Here are the ingrediants of pizza : ");
        System.out.println(Pizza.bread);
        System.out.println(Pizza.sauce);
        System.out.println(Pizza.toppings);
        System.out.println(Pizza.cheese);

        Car car = new Car();

        System.err.println(car.toString()); //explicit
        System.out.println(car); //implicitly

        System.out.println(car.make);
        System.out.println(car.color);
        System.out.println(car.model);
        System.out.println(car.price);

        int [] numbers = new int[3];
        char[] characters = new char[10];

        Food[] refri = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("food2");
        Food food3 = new Food("food3");

        // Food [] refri = {food1,food2,food3};

        refri[0] = food1;
        refri[1] = food2;
        refri[2] = food3;

        System.out.println(refri[0].name);
        System.out.println(refri[1].name);
        System.out.println(refri[2].name);


        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");
        garage.park(car1);
        garage.park(car2);

        Friend friend1 = new Friend("f1");
        Friend friend2 = new Friend("f2");
        Friend friend3 = new Friend("f3");

        System.out.println(Friend.noOfFriends);

        Friend.display();
        Math.round(0);

        Car car = new Car();
        car.go();
        Bicycle bike = new Bicycle();
        bike.stop();
        System.out.println(bike.paddles);

        Animal animal = new Animal();
        animal.speak();
        Dog dog = new Dog();
        dog.speak();

        Hero hero = new Hero("Batman" , 42,"@@");
        Hero hero2 = new Hero("superman" , 32,"##@");

        System.out.println(hero.name);
        System.out.println(hero.Power);
        System.out.println(hero.age);

        System.out.println(hero2.name);
        System.out.println(hero2.Power);
        System.out.println(hero2.age);*/


        // Car carr = new Car();
        // // Vehicle vehicle = new Vehicle();
        // carr.go();

        // Car2 gadi = new Car2("Name" , "model",2024);

        // System.out.println(gadi.getMake());
        // System.out.println(gadi.getModel());
        // System.out.println(gadi.getYear());

        // Car2 gadi1 = new Car2("Mustang", "Camero", 2021);
        // Car2 gadi2 = new Car2("Swift", "Camero", 2024);

        // gadi2.copy(gadi1);

        // System.out.println(gadi1);
        // System.out.println(gadi2);

        // System.out.println(gadi1.getMake());
        // System.out.println(gadi1.getModel());
        // System.out.println(gadi1.getYear());

        // System.out.println(gadi2.getMake());
        // System.out.println(gadi2.getModel());
        // System.out.println(gadi2.getYear());

        // Rabbit rabbit = new Rabbit();
        // rabbit.flee();

        // Hawl hawk = new Hawl();
        // hawk.hunt();

        // fish Fish  = new fish();
        // Fish.hunt();
        // Fish.flee();

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};
        car.go();
        bicycle.go();
        boat.go();

        for(Vehicle x : racers){
            x.go();
        }

        Scanner scanner = new Scanner(System.in);

        Animal animal ;
        System.out.println("What animal do you want");
        System.out.println("(1=dog) or (2=cat):");
        int ch = scanner.nextInt();
        if(ch ==1){
            animal = new Dog();
            animal.speak();
        }
        else if(ch ==2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            animal.speak();
        }

        try{

            System.out.println("Enter a whole no. to divide");
            int num = scanner.nextInt();
            System.out.println("Enter a whole no. to divide by");
            int y = scanner.nextInt();
    
            int z = num/y;
            System.out.println("result " + z);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by Zero ! Idiot");
        }
        catch(InputMismatchException e){
            System.out.println("Plz enter a number!");
        }
        catch(Exception e){
            System.out.println("Something went Wrong!");
        }
        finally{
            System.out.println("This will always be printed");
            scanner.close();
        }
    }


    static void hello(String n , int x){
        System.out.println("Hello Java !");
        System.out.println(n);
        System.out.println("Age is "+x);
    }

    static int add(int a, int b){
        System.out.println("This is method 1");
        return (a+b);
    }

    static int add(int a, int b , int c){
        System.out.println("This is method 2");
        return a+b+c;
    }

    static int add(int a, int b , int c,int d){
        System.out.println("This is method 3");
        return a+b+c+d;
    }

    static double add(double a, double b){
        System.out.println("This is method 4");
        return (a+b);
    }

    static double add(double a, double b , double c){
        System.out.println("This is method 5");
        return a+b+c;
    }

    static double add(double a, double b , double c,double d){
        System.out.println("This is method 6");
        return a+b+c+d;
    }

}
