public class Pirates {

    int intoxication = 0;
    boolean isDead;
    boolean passedOut;
    String parrot;

    Pirates() {
        this.intoxication = 0;
        this.isDead = false;
        this.passedOut = false;
    }


    public int drinkSomeRum(int intoxicationLevel) {
        this.intoxication += intoxicationLevel;
        if (this.isDead) {
            System.out.println("He's dead.");
        }
        return this.intoxication;
    }

    public boolean howsItGoingMate() {
        if (this.intoxication <= 4) {
            System.out.println("Pour me anudder!");
            return false;
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
            return true;
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
