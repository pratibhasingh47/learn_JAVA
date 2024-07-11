import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello Morning Star");

        // Variables
        int x = 123;
        System.out.println(x);
        System.out.println("x");
        // byte x = 130; error
        byte x1 = 127;
        float y = 3.14f;
        double Y = 3.14;
        boolean z = true;
        char symbol = '@';
        String name = "Hello";

        System.out.println("My no. is " + x);
        System.out.println(symbol);
        System.out.println(x1);
        System.out.println(y);
        System.out.println(Y);
        System.out.println(z);
        System.out.println(name);


        //Swap values
        int X = 100;
        int U = 1000;

        int temp = X;
        X = U;
        U = temp;

        System.out.println(X);
        System.out.println(U);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");
        String Namee = scanner.nextLine();

        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your fav food ?");
        String food = scanner.nextLine();

        System.out.println("Hello "+Namee);
        System.out.println("Age is "+age);
        System.out.println("Fav food is "+food);

        double friends = 12;
        friends = friends+1;
        friends--;
        friends++;

        friends = (double) friends/3;
        System.out.println(friends);

        double q = 3.14;
        double w = -10;

        double e = Math.max(q, w);
        double e1 = Math.abs( w);

        System.out.println(e);
        System.out.println(e1);

        double base , side;
        // Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base : ");
        base = scanner.nextDouble();

        System.out.println("Enter side : ");
        side = scanner.nextDouble();

        double hypo = Math.sqrt((base*base)+(side*side));
        System.out.println("The hypotenous is " + hypo);

        scanner.close();

    }
}
