package Animals;

public class Bird extends Animal {

    private String featherType;
    private int vision = 270;

    public Bird(String name) {
        super(name);
    }

    public void sing() {
        System.out.println("We birds sing very beautifully!");
    }

    @Override
    public String breed() {
        return "by laying eggs.";
    }

    @Override
    public void move() {
        System.out.println("I am flying.");
    }
}
