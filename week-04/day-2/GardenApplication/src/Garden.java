// is able to hold unlimited amount of flowers or trees
//when watering it should only water those what needs water with equally divided amount amongst them
//eg. watering with 40 and 4 of them need water then each gets watered with 10

import java.util.ArrayList;

public class Garden {

    private String name;
    private ArrayList<Plant> garden;

    Garden(String name) {
        this.name = name;
        this.garden = new ArrayList<Plant>();
    }

    public void addFlowers(Flower flower) {
        garden.add(flower);
    }

    public void addTrees(Tree tree) {
        garden.add(tree);
    }

    public void getInfo() {
        for (int i = 0; i < garden.size(); i++) {
            garden.get(i).getInfo();
        }
    }

    public void wateringPlants(int waterAmount) {
        System.out.println();
        System.out.println("Watering with: " + waterAmount);
        int counter = 0;
        int exactWaterAmount = 0;
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).ifWaterIsNeeded()) {
                counter++;
            }
        }
        exactWaterAmount = waterAmount / counter;
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).ifWaterIsNeeded()) {
                if (garden.get(i) instanceof Flower) {
                    ((Flower) garden.get(i)).wateringFlower(exactWaterAmount);
                } else {
                    ((Tree) garden.get(i)).wateringTree(exactWaterAmount);
                }
            }
        }
    }

}
