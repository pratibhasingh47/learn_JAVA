import java.util.Scanner;
import java.util.Random;


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
        Scanner scanner = new Scanner(System.in);
        // String name = "";

        // while(name.isBlank()){
        //     System.out.print("Enter your name : ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello "+name);

        // for(int i = 0; i<=10 ; i++ ){
        //     System.out.println("The no. is "+i);
        // }

        int rows , columns;
        String symbols = "";

        System.out.println("Enter # of rows : ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns : ");
        columns = scanner.nextInt();

        System.out.println("Enter symbol to use : ");
        symbols = scanner.next();

        for(int i = 1;i<= rows ; i++){
            System.out.println();
            for(int j = 1;j<=columns;j++){
                System.out.print(symbols);
            }
        }
    }
}
