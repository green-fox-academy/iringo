public class Bird extends Animal implements Flyable {

    private String featherType;
    private int vision = 270;

    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "I am laying eggs.";
    }

    public void sing() {
        System.out.println("We birds sing very beautifully!");
    }

    @Override
    public void land() {
        System.out.println("I can land on my legs.");
    }

    @Override
    public void fly() {
        System.out.println("I can fly with my wings.");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off is nothing for me.");
    }

}
