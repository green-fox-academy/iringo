public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal(50, 50);

        for (int i = 0; i < 5; i++) {
            animal1.eat();
        }
        animal1.eat();
        System.out.println(animal1.hunger);

        for (int i = 0; i < 8; i++) {
            animal1.drink();
        }
        System.out.println(animal1.thirst);

        for (int i = 0; i < 4; i++) {
            animal1.play();
        }
        System.out.println("Hunger: " + Integer.toString(animal1.hunger) + " " + "Thirst: " + Integer.toString(animal1.thirst));

    }

}
