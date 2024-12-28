// PekingDuck.java
public class PekingDuck extends Duck {
    @Override
    public void clean(Animal animal) {
        System.out.println("The PekingDuck cleans animals with extra care.");
    }

    public void beCrispy() {
        System.out.println("The PekingDuck is getting crispy!");
    }
}

