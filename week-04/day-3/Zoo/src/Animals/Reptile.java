package Animals;

public class Reptile extends Animal {

    private int numberOfLegs = 4;

    public Reptile(String name) {
        super(name);
    }

    public void scales() {
        System.out.println("My skin is covered with scales.");
    }

    @Override
    public String breed() {
        return "by laying eggs.";
    }

    @Override
    public void move() {
        System.out.println("I think I am also walking.");
    }

}
