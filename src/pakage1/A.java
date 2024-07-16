package pakage1;
import pakage2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);

        B b = new B();
        // System.out.println(b.privateMsg);
    }

    protected String protectedMsg = "This is protected message";

}
