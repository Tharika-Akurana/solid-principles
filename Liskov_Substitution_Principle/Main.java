public class Main {
    public static void main(String[] args) {
        // objects of type Bird, Eagle and Sparrow
        Bird myBird = new Bird();
        Bird myEagel = new Eagle();
        Bird mySparrow = new Sparrow();

        // calling methods
        System.out.println("Using Bird Object: ");
        myBird.fly();
        myBird.eat();

        System.out.println("\nUsing Eagle object (substituted as Bird): ");
        myEagel.fly(); // should still work as expected
        myEagel.eat(); // should still work as expected

        System.out.println("\nUsing Sparrow object (substituted as Bird): ");
        mySparrow.fly(); // should still work as expected
        mySparrow.eat(); // should still work as expected
    }
}