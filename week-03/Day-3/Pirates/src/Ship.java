import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ship {

    Pirates captain;
    Pirates pirates;
    List<Pirates> crew;
    int randomNumber = (int) (Math.random() * 10);

    Ship() {
        crew = new ArrayList<>();
    }

    public void fillShip () {
        this.captain = new Pirates();
        crew.add(0, captain);
        for (int i = 1; i < randomNumber + 2; i++) {
            this.crew.add(i, new Pirates());
        }
    }

    public void getInfo() {
        System.out.println("Captain's consumed rum:  " + captain.intoxication + ". " + "Captain is dead: " + captain.isDead + ". " + "Captain is passed out: " + captain.howsItGoingMate());
        int counter = 0;
        for (int i = 1; i < crew.size(); i++) {
            if (crew.get(i).isDead == false) {
                counter ++;
            }
        }
        System.out.println("The number of pirates is: " + (crew.size()-1) + " " + "The number of alive pirates is: " + counter);
    }

    public boolean shipBattle (Ship enemyShip) {

        int scoreShip1 = 0;
        int scoreShip2 = 0;

        for (int i = 1; i < this.crew.size(); i++) {
            if (!this.crew.get(i).isDead) {
                scoreShip1++;
            }
        }
        scoreShip1 += this.captain.intoxication;

        for (int i = 1; i < enemyShip.crew.size(); i++) {
            if (!enemyShip.crew.get(i).isDead) {
                scoreShip2++;
            }
        }
        scoreShip2 += enemyShip.captain.intoxication;

        if (scoreShip1 > scoreShip2) {
            for (int i = 0; i <this.crew.size() ; i++) {
                crew.get(i).drinkSomeRum(randomNumber+2);
                captain.drinkSomeRum(randomNumber+2);
            }
            for (int i = 1; i < randomNumber-1; i++) {
                enemyShip.crew.get(i).die();
            }
            return true;
        } else {
            for (int i = 1; i < enemyShip.crew.size(); i++) {
                enemyShip.crew.get(i).drinkSomeRum(randomNumber+2);
                enemyShip.captain.drinkSomeRum(randomNumber+2);
            }
            for (int i = 1; i < randomNumber-1; i++) {
                this.crew.get(i).die();
            }
            return false;
        }

    }
}
