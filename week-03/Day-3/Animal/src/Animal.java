// Every animal has a hunger value, which is a whole number
//Every animal has a thirst value, which is a whole number
//when creating a new animal object these values are created with the default 50 value
//Every animal can eat() which decreases their hunger by one
//Every animal can drink() which decreases their thirst by one
//Every animal can play() which increases both by one


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
