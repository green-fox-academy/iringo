public class BattleApp {

    public static void main(String[] args) {

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();

        ship1.fillShip();
        ship1.captain.drinkSomeRum(2);
        ship2.fillShip();
        System.out.println(ship1.shipBattle(ship2));
        ship1.getInfo();
        ship2.getInfo();

    }
}
