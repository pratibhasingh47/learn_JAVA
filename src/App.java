import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.out.println("Hello Morning Star");

        // // Variables
        // int x = 123;
        // System.out.println(x);
        // System.out.println("x");
        // // byte x = 130; error
        // byte x1 = 127;
        // float y = 3.14f;
        // double Y = 3.14;
        // boolean z = true;
        // char symbol = '@';
        // String name = "Hello";

        // System.out.println("My no. is " + x);
        // System.out.println(symbol);
        // System.out.println(x1);
        // System.out.println(y);
        // System.out.println(Y);
        // System.out.println(z);
        // System.out.println(name);


        // //Swap values
        // int X = 100;
        // int U = 1000;

        // int temp = X;
        // X = U;
        // U = temp;

        // System.out.println(X);
        // System.out.println(U);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("What is your name ?");
        // String Namee = scanner.nextLine();

        // System.out.println("How old are you ?");
        // int age = scanner.nextInt();
        // scanner.nextLine();

        // System.out.println("What is your fav food ?");
        // String food = scanner.nextLine();

        // System.out.println("Hello "+Namee);
        // System.out.println("Age is "+age);
        // System.out.println("Fav food is "+food);

        // double friends = 12;
        // friends = friends+1;
        // friends--;
        // friends++;

        // friends = (double) friends/3;
        // System.out.println(friends);

        // double q = 3.14;
        // double w = -10;

        // double e = Math.max(q, w);
        // double e1 = Math.abs( w);

        // System.out.println(e);
        // System.out.println(e1);

        // double base , side;
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter base : ");
        // base = scanner.nextDouble();

        // System.out.println("Enter side : ");
        // side = scanner.nextDouble();

        // double hypo = Math.sqrt((base*base)+(side*side));
        // System.out.println("The hypotenous is " + hypo);


        // //Random Variable
        // Random random = new Random();

        // int i = random.nextInt();
        // int i = random.nextInt(6);
        // double d = random.nextDouble();
        // boolean b =random.nextBoolean();
        // System.out.println(i);
        // System.out.println(d);
        // System.out.println(b);

        // scanner.close();

        //IF STATEMENTS
        // int agee = 20;

        // if( agee >= 18){
        //     System.out.println("You are adult!");
        // }
        // else if(agee >= 75){
        //     System.out.println("You are old citizens!");
        // }
        // else{
        //     System.out.println("You are not adult!");
        // }

        
        // //SWITCH
        // String day = "Friday";

        // switch (day) {
        //     case "Sunday":
        //         System.out.println("Today is Sunday");
        //         break;
        //     case "Monday":
        //         System.out.println("Today is Monday");
        //         break;
        //     case "Tuesday":
        //         System.out.println("Today is Tuesday");
        //         break;
        //     case "Wednesday":
        //         System.out.println("Today is Wednesday");
        //         break;
        //     case "Thursday":
        //         System.out.println("Today is Thursday");
        //         break;
        //     case "Friday":
        //         System.out.println("Today is Friday");
        //         break;
        //     case "Saturday":
        //         System.out.println("Today is Saturday");
        //         break;
        
        //     default:
        //         System.out.println("Invalid day options");
        //         break;
        // }


        // //LOGICAL OPERATOR
        // int temperature = 25;
        // if(temperature>30){
        //     System.out.println("It is hot outside!");
        // }
        // else if(temperature>=20 && temperature<=30){
        //     System.out.println("It's moderate");
        // }
        // else{
        //     System.out.println("It is cold outside!");
        // }

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("You are playing a game ! press q or Q to quit");
        // String response = scanner.next();

        // if(response.equals("q") || response.equals("Q ")){
        //     System.out.println("You quit the game");
        // }
        // else{
        //     System.out.println("You are still playing the game...");
        // }


        // LOOP
        // Scanner scanner = new Scanner(System.in);
        // String name = "";

        // while(name.isBlank()){
        //     System.out.print("Enter your name : ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello "+name);

        // for(int i = 0; i<=10 ; i++ ){
        //     System.out.println("The no. is "+i);
        // }

        // int rows , columns;
        // String symbols = "";

        // System.out.println("Enter # of rows : ");
        // rows = scanner.nextInt();
        // System.out.println("Enter # of columns : ");
        // columns = scanner.nextInt();

        // System.out.println("Enter symbol to use : ");
        // symbols = scanner.next();

        // for(int i = 1;i<= rows ; i++){
        //     System.out.println();
        //     for(int j = 1;j<=columns;j++){
        //         System.out.print(symbols);
        //     }
        // }





        //ARRAYS
        String[] cars = {"Camaro" , "Corvette" ,"Tesla"};
        cars[0] = "Mustang";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        String[] car = new String[3];
        car[0] = "C";
        car[1] = "A";
        car[2] = "B";

        System.out.println(car[0]);
        System.out.println(car[1]);
        System.out.println(car[2]);

        for(int i = 0; i <3 ; i++){
            System.out.println(car[i]);
            System.out.println(cars[i]);
        }


        String [][] CARS = new String[3][3];
        CARS[0][0] = "A";
        CARS[0][1] = "B";
        CARS[0][2] = "C";
        CARS[1][0] = "D";
        CARS[1][1] = "E";
        CARS[1][2] = "F";
        CARS[2][0] = "G";
        CARS[2][1] = "H";
        CARS[2][2] = "I";

        for(int i =0 ; i <CARS.length ; i++){
            System.out.println();
            for(int j = 0 ; j<CARS.length ;j++){
                System.out.print(CARS[i][j] + " ");
            }
        }

        String NAME = "    Broooooo     ";

        boolean result = NAME.equals("Bro");
        boolean result1 = NAME.equalsIgnoreCase("bro");
        int result2 = NAME.length();
        char result3 = NAME.charAt(1);
        int result4 = NAME.indexOf("B");
        boolean result5 = NAME.isEmpty();
        String result6 = NAME.toUpperCase();
        String result7 = NAME.toLowerCase();
        String result8 = NAME.trim();
        String result9 = NAME.replace('o', 'a');


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9 );


        //WRAPPER CLASS
        Boolean a = true;
        Character b ='@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Broo";

        if ( a ==  true){
            System.out.println("This is true");
        }


        // ARRAYLIST

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("burger");
        food.add("dosa");

        food.set(0, "idli");
        food.remove(2);
        food.clear();

        for(int i = 0 ; i <food.size(); i++){
            System.out.println(food.get(i));
        }

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> productList = new ArrayList<>();
        productList.add("tomato");
        productList.add(" bread");
        productList.add("pepper");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add(" cola");
        drinkList.add("milka");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinkList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));


        String[] animals = {"cat","dog","rat","bird"};
        ArrayList<String> Animals = new ArrayList<String>();

        Animals.add("A");
        Animals.add("B");
        Animals.add("C");
        Animals.add("D");

        for(String i : Animals){
            System.out.println(i);
        }
    }
}
