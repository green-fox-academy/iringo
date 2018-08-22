public class Helicopter extends Vehicle implements Flyable {

    @Override
    public void land() {
        System.out.println("I can land safely.");
    }

    @Override
    public void fly() {
        System.out.println(" I can fly.");
    }

    @Override
    public void takeOff() {
        System.out.println("I can take off easily.");
    }

}
