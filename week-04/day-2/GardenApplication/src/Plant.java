public class Plant {

    private String color;
    private String name;
    private double waterAmount;

    Plant(String name, String color) {
        this.name = name;
        this.color = color;
        this.waterAmount = 0;
    }

    public Double getWaterAmount() {
        return waterAmount;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setWaterAmount(double wateringWater, double absorption) {
        this.waterAmount = waterAmount + wateringWater * absorption;
    }

    public boolean ifWaterIsNeeded() {
        if (getWaterAmount() < 15) {
            return true;
        }
        return false;
    }

    public void getInfo() {
        if (ifWaterIsNeeded()) {
            System.out.println("The" + " " + getColor() + " " + getName() + " " + "needs water.");
        } else {
            System.out.println("The" + " " + getColor() + " " + getName() + " " + "does not need water.");
        }
    }

}
