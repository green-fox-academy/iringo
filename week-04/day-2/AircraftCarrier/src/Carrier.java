import java.util.ArrayList;

public class Carrier {

    private int ammoStorage;
    private int healthPoint;

    ArrayList<Aircraft> carrier;

    Carrier(int ammoStorage, int healthPoint) {
        carrier = new ArrayList<>();
        this.ammoStorage = ammoStorage;
        this.healthPoint = healthPoint;
    }

    public void add(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    public void fill(int ammoAmount) {
        if (ammoStorage <= 0) {
            throw new ArithmeticException();
        }
        this.ammoStorage = ammoStorage - ammoAmount * carrier.size();
        if (ammoStorage < ammoAmount * carrier.size()) {
            for (int i = 0; i < carrier.size(); i++) {
                if (carrier.get(i).isPriority()) {
                    carrier.get(i).refill(ammoAmount);
                }
            }
        }
        for (int i = 0; i < carrier.size(); i++) {
            carrier.get(i).refill(ammoAmount);
        }
    }

    public void fight(Carrier enemy) {
        int allDamage = 0;
        for (int i = 0; i < carrier.size(); i++) {
            carrier.get(i).fight();
            allDamage += carrier.get(i).fight();
        }
        this.healthPoint -= allDamage;
    }

    public void getStatus() {
        if (healthPoint == 0) {
            System.out.println("It's dead Jim :(");
        } else {
            int totalDamage = 0;
            for (int i = 0; i < carrier.size(); i++) {
                totalDamage += carrier.get(i).getDamage();
            }
            System.out.println("HP: " + healthPoint + ", " + "Aircraft count: " + carrier.size() + ", " + "Ammo storage: " + this.ammoStorage + ", " + "Total damage: " + totalDamage);
            System.out.println("Aircrafts: ");
            for (int i = 0; i < carrier.size(); i++) {
                carrier.get(i).getStatus();
            }
        }
    }
}
