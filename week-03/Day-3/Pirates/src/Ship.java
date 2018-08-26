import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ship {

    Pirates captain;
    Pirates pirates;

    ArrayList<Pirates> crew = new ArrayList<>();

    public void fillShip () {
        this.crew.add(1, captain);
        int randomNumber = (int) (Math.random()*20);
        for (int i = 0; i < randomNumber; i++) {
            this.crew.add(new Pirates());
        }
    }

    public boolean shipBattle (Ship enemyShip) {
        int scoreShip1 = 0;
        int scoreShip2 = 0;

        for (int i = 1; i < this.crew.size(); i++) {
            if (!this.pirates.isDead) {
                scoreShip1++;
            }
        }
        if (!this.captain.isDead) {
            scoreShip1++;
        }
        scoreShip1 = scoreShip1 + this.captain.intoxication;

        for (int i = 0; i < enemyShip.crew.size(); i++) {
            if (!enemyShip.pirates.isDead) {
                scoreShip2++;
            }
        }
        if (!enemyShip.captain.isDead) {
            scoreShip2++;
        }
        scoreShip2 = scoreShip2 + enemyShip.captain.intoxication;

        if (scoreShip1 > scoreShip2) {
            for (int i = 0; i <this.crew.size() ; i++) {
                int randomNumber = (int) (Math.random()*10);
                pirates.drinkSomeRum(randomNumber);
            }
            int randomNumber = (int) (Math.random()*5);
            for (int i = 0; i < randomNumber; i++) {
                enemyShip.pirates.die();
            }
            return true;
        } else {
            for (int i = 0; i < enemyShip.crew.size(); i++) {
                int randomNumber = (int) (Math.random()*10);
                enemyShip.pirates.drinkSomeRum(randomNumber);
            }
            int randomNumber = (int) (Math.random() * 5);
            for (int i = 0; i < randomNumber; i++) {
                this.pirates.die();
            }
            return false;
        }

    }
}
