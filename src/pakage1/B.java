package pakage1;
import pakage2.*;

public class B {
    private String privateMsg = "This is private message";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
