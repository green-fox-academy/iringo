public class Main {

    public static void main(String[] args) {

        Flower flower1 = new Flower("Flower", "yellow");
        Flower flower2 = new Flower("Flower", "blue");

        Tree tree1 = new Tree("Tree", "purple");
        Tree tree2 = new Tree("Tree", "orange");

        Garden gardenList = new Garden("myFirstGarden");
        gardenList.addFlowers(flower1);
        gardenList.addFlowers(flower2);
        gardenList.addTrees(tree1);
        gardenList.addTrees(tree2);

        gardenList.getInfo();
        gardenList.wateringPlants(40);
        gardenList.getInfo();
        gardenList.wateringPlants(70);
        gardenList.getInfo();

    }

}
