public class Main {

    public static void main(String[] args) {

        Pirates pirate1 = new Pirates();
        Pirates pirateEnemy = new Pirates();
        pirate1.drinkSomeRum(3);
        pirate1.howsItGoingMate();
        System.out.println(pirate1.passedOut);
        pirate1.brawl(pirateEnemy);
        System.out.println(pirate1.isDead);
        System.out.println(pirateEnemy.isDead);
        System.out.println(pirate1.passedOut);
        System.out.println(pirateEnemy.passedOut);
    }
}
