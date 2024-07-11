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

    }
}
