public class Animal {

    int hunger;
    int thirst;

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

    public void play() {
        this.hunger++;
        this.thirst++;
    }

}