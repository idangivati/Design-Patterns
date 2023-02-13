package creational.pattern.singleton;
import creational.pattern.singleton.Singleton;
class SingletonMain {
    // Main driver method
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.Singleton();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.Singleton();

        // instantiating Singleton class with variable z
        Singleton z = Singleton.Singleton();

        // Now  changing variable of instance x
        // via toUpperCase() method
        x.setData(x.getData().toLowerCase());

        // Print and display commands
        System.out.println("String from x is " + x.getData());
        System.out.println("String from y is " + y.getData());
        System.out.println("String from z is " + z.getData());
        System.out.println("\n");

        // Now again changing variable of instance x
        z.setData(z.getData().toUpperCase());

        System.out.println("String from x is " + x.getData());
        System.out.println("String from y is " + y.getData());
        System.out.println("String from z is " + z.getData());
    }
}