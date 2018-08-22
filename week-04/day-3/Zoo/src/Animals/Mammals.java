package Animals;

public class Mammals extends Animal {

    private String hairOrFurr;
    private String skinType;

    public Mammals(String name) {
        super(name);
    }

    public void warmBlooded() {
        System.out.println("I am warm blooded.");
    }

    @Override
    public String breed() {
        return "pushing miniature version out.";
    }

    @Override
    public void move() {
        System.out.println("I am walking.");
    }
}
