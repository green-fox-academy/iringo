import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> list = new ArrayList<>();
    int slots;

    public void animalBreed() {
        if (this.slots >= 0) {
            Animal newAnimal = new Animal(10, 10);
        }
    }

    public void slaughter() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).hunger > max) {
                max = list.get(i).hunger;
                index = i;
            }
        }
        list.remove(index);
    }

}
