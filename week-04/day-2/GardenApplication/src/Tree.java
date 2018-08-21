// needs water if its current water amount is less then 10
//when watering it the tree can only absorb the 40% of the water
//eg. watering with 10 the tree's amount of water should only increase with 4


public class Tree extends Plant {

    Tree(String name, String color) {
        super(name, color);
    }

    @Override
    public boolean ifWaterIsNeeded() {
        if (getWaterAmount() < 10) {
            return true;
        }
        return false;
    }

    public void wateringTree(double waterAmount) {
        setWaterAmount(waterAmount, 0.40);
    }

}
