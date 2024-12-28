// Owl.java
public class Owl extends Animal implements Flyable {
    @Override
    public void sound() {
        System.out.println("Hoot!");
    }

    @Override
    public void fly() {
        System.out.println("The owl is flying silently.");
    }

    @Override
    public void glide() {
        System.out.println("The owl is gliding through the night sky.");
    }

    public void clean(Animal animal) {
        System.out.println("The owl is cleaning the " + animal.getClass().getSimpleName() + ".");
    }
}
