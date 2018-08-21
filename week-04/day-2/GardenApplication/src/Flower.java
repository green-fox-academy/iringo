// needs water if its current water amount is less then 5
//when watering it the flower can only absorb the 75% of the water
//eg. watering with 10 the flower's amount of water should only increase with 7.5

import java.lang.annotation.Inherited;

public class Flower extends Plant {

    Flower(String name, String color) {
        super(name, color);
    }

    @Override
    public boolean ifWaterIsNeeded() {
        if (getWaterAmount() < 5) {
            return true;
        }
        return false;
    }

    public void wateringFlower(double waterAmount) {
        setWaterAmount(waterAmount, 0.75);
    }

}
