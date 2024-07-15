public class pizza {

    String bread;
    String sauce;
    String cheese;
    String toppings;

    pizza(String bread,
            String sauce,
            String cheese,
            String toppings) {

                this.bread = bread;
                this.cheese = cheese;
                this.sauce =sauce;
                this.toppings = toppings;
    }

    pizza(String bread,
    String sauce,
    String cheese) {

        this.bread = bread;
        this.cheese = cheese;
        this.sauce =sauce;
    }

    pizza(String bread,
            String sauce) {

                this.bread = bread;
                this.sauce = sauce;
    }


    pizza(String bread) {

                this.bread = bread;
    }

    pizza(){
        
    }
}
