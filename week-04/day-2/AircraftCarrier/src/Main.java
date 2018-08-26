public class Main {
    public static void main(String[] args) {

        Carrier myCarrier = new Carrier(2300, 5000);
        myCarrier.add(new F16());
        myCarrier.add(new F35());
        myCarrier.add(new F35());
        myCarrier.add(new F16());
        myCarrier.getStatus();
        myCarrier.fill(150);
        myCarrier.fill(150);
        myCarrier.fill(150);
        myCarrier.fill(150);
        myCarrier.getStatus();

        Carrier carrier2 = new Carrier(1500, 3000);
        carrier2.fill(150);
        carrier2.fill(150);
        carrier2.fill(150);
        carrier2.fill(150);
        carrier2.fill(150);
        myCarrier.fight(carrier2);
        myCarrier.fight(carrier2);
        myCarrier.getStatus();
        carrier2.getStatus();


    }
}
