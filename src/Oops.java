public class Oops {
    
    public static void main(String[] args) {

        // String name = "Broo";
        // int age = 21;
        // hello(name,age);

        // int x = 3;
        // int y = 5;

        // int z = add(x, y);
        // System.out.println(add(x, y));
        // System.out.println(z);

        // System.out.println(add(10, 2));
        // System.out.println(add(10, 2 , 14));
        // System.out.println(add(10, 2 , 14,7));

        // System.out.println(add(10.25, 2.58));
        // System.out.println(add(10.00, 2.25 , 14.88));
        // System.out.println(add(10.25, 2.25 , 14.58,7.36));

        // System.out.printf("This is a format string %d",123);

        // boolean mybool = true;
        // char mychar = '@';
        // String myString = "Broo";
        // int myInt = 50;
        // double mydouble = 100.00;

        // System.out.printf("%b",mybool);
        // System.out.printf("%c",mychar);
        // System.out.printf("%s",myString);
        // System.out.printf("Hello %10s",myString);
        // System.out.printf("%d",myInt);
        // System.out.printf("%f",mydouble);

        // final double pi = 3.14159;
        // System.out.println(pi);

        // Car mycar = new Car();
        // Car mycar2 = new Car();
        // System.out.println(mycar.color);
        // System.out.println(mycar.make);
        // System.out.println(mycar.model);
        // System.out.println(mycar.price);
        // System.out.println(mycar.year);


        // System.out.println(mycar2.color);
        // System.out.println(mycar2.make);
        // System.out.println(mycar2.model);
        // System.out.println(mycar2.price);
        // System.out.println(mycar2.year);

        // mycar.brake();
        // mycar.drive();

        // Human human = new Human("John", 69, 70.58);
        // Human human2 = new Human("Rick", 69, 70.58);

        // System.out.println(human.name);
        // human2.eat();
        // human.drink();

        // diceRoller dc = new diceRoller();

        pizza Pizza = new pizza("thin crust","tomato","mozzerella","jalpaneo");

        System.out.println("Here are the ingrediants of pizza : ");
        System.out.println(Pizza.bread);
        System.out.println(Pizza.sauce);
        System.out.println(Pizza.toppings);
        System.out.println(Pizza.cheese);

        Car car = new Car();

        System.err.println(car.toString());

        System.out.println(car.make);
        System.out.println(car.color);
        System.out.println(car.model);
        System.out.println(car.price);
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