// Duck.java
public class Duck extends Animal implements Flyable {
    @Override
    public void sound() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }

    @Override
    public void glide() {
        System.out.println("The duck is gliding smoothly.");
    }

    public void clean(Animal animal) {
        System.out.println("The duck is cleaning the " + animal.getClass().getSimpleName() + ".");
    }
}




