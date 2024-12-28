// Lec06.java
public class Lec06 {
    public static void main(String[] args) {
        // Create instances of animals
        Animal cow = new Cow();
        Animal owl = new Owl();
        Animal duck = new Duck();
        Animal pig = new Pig();
        Duck pekingDuck = new PekingDuck();

        // Call sound() method on each animal
        System.out.println("Animal sounds:");
        cow.sound();
        owl.sound();
        duck.sound();
        pig.sound();

        // Demonstrate Duck's behavior
        System.out.println("\nDuck behaviors:");
        Duck regularDuck = new Duck();
        regularDuck.sound();
        regularDuck.fly();
        regularDuck.glide();
        regularDuck.clean(cow);

        // Demonstrate PekingDuck's behavior
        System.out.println("\nPekingDuck behaviors:");
        pekingDuck.sound();
        pekingDuck.fly();
        pekingDuck.glide();
        pekingDuck.clean(owl);
        ((PekingDuck) pekingDuck).beCrispy();

        // Demonstrate polymorphism
        System.out.println("\nPolymorphism demonstration:");
        Animal polymorphicDuck = new PekingDuck();
        polymorphicDuck.sound(); // Calls PekingDuck's inherited sound()
        ((PekingDuck) polymorphicDuck).beCrispy(); // Downcast to PekingDuck
    }
}

