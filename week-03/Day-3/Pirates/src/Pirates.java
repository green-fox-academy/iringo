public class Pirates {

    int intoxication = 0;
    boolean isDead;
    boolean passedOut;
    String parrot;

    public void drinkSomeRum(int intoxicationLevel) {
        this.intoxication += intoxicationLevel;
        if (this.isDead) {
            System.out.println("He's dead.");
        }
    }

    public void howsItGoingMate() {
        if (this.intoxication <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
        }
    }

    public boolean die() {
        return (this.isDead = true);
    }

    public void brawl (Pirates pirateEnemy) {
        if (!pirateEnemy.isDead) {
            int randomNumber = (int) (Math.random()*3);
            if (randomNumber == 0) {
                this.isDead = true;
            } else if (randomNumber == 1) {
                pirateEnemy.isDead = true;
            } else if (randomNumber == 2) {
                this.passedOut = true;
                pirateEnemy.passedOut = true;
            }
        }
    }

}
