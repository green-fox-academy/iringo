public class Main {
    public static void main(String[] args) {
        F16 plane1 = new F16();

        F35 plane2 = new F35();

        plane1.refill(15);
        plane2.refill(15);
        plane1.getStatus();
        plane2.getStatus();
        System.out.println(plane1.getType());
        plane2.getType();

        Carrier myCarrier = new Carrier(2300, 5000);
        myCarrier.add(new F16());
        myCarrier.add(new F35());
        myCarrier.add(new F35());
        myCarrier.add(new F16());
        myCarrier.getStatus();
        myCarrier.fill(15);
        System.out.println();
        myCarrier.getStatus();

        Carrier carrier2 = new Carrier(1500, 3000);

        myCarrier.fight(carrier2);


    }
}
