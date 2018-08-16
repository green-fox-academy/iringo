public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Station station1 = new Station(10000);

        station1.refill(car1);
        System.out.println(car1.gasAmount);
        System.out.println(station1.gasAmount);

    }

}
