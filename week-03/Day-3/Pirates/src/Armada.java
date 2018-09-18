import java.util.ArrayList;
import java.util.List;

public class Armada {

    List<Ship> armada = new ArrayList<>();

    public void fillArmada() {
        for (int i = 0; i < 5; i++) {
            this.armada.add(new Ship());
            this.armada.get(i).fillShip();
        }
    }

    public boolean armadaWar(Armada enemyArmada) {
        enemyArmada = new Armada();
        int i = 0;
        for (int j = 0; j < enemyArmada.armada.size(); j++) {
            if (armada.get(i).shipBattle(enemyArmada.armada.get(j))) {
                enemyArmada.armada.remove(j);
                armada.get(i).shipBattle(enemyArmada.armada.get(j + 1));
            } else {
                armada.remove(i);
                armada.get(i+1).shipBattle(enemyArmada.armada.get(j));

            }
            i++;
        }
        if (armada.size() > enemyArmada.armada.size()) {
            return true;
        }
        return false;
    }
}
