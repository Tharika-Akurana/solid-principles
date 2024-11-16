// keyboard interface - Abstraction
interface Keyboard {
    void type ();
}

// Monitor interface - Abstraction
interface Monitor {
    void display ();
}

// MechanicalKeyboard class - low-level-module
class MechanicalKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("Typing on a mechanical keyboard...");
    }
}

// LEDMonitor class - Low-level module
class LEDMonitor implements Monitor {
    @Override
    public void display() {
        System.out.println("Displaying on an LED monitor...");
    }
}

// Computer class - High-level module
class Computer {
    private final Keyboard keyboard;
    private final Monitor monitor;

    // Constructorto inject dependencies
    public Computer (Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    // Method to turn on the computer
    public void start() {
        System.out.println("Computer is starting...");
        keyboard.type();
        monitor.display();
        System.out.println("Computer is ready to use!");
    }
}

public class Main {
    public static void main(String[] args) {
        // creating dependencies
        Keyboard keyboard = new MechanicalKeyboard();
        Monitor monitor = new LEDMonitor();

        // injecting dependencies into computer
        Computer myComputer = new Computer(keyboard, monitor);

        //Start the computer
        myComputer.start();
    }
}