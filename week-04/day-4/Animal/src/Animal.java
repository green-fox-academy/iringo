public class Animal {

    private int hunger;
    private int thirst;

    Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int eat() {
        this.hunger--;
        return hunger;
    }

    public int drink() {
        this.thirst--;
        return thirst;
    }

    public int play() {
        this.hunger++;
        this.thirst++;
        return hunger + thirst;
    }

}