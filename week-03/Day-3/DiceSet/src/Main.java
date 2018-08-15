public class Main {

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();

        diceSet.roll();

        for (int i = 0; i < diceSet.dices.length; i++) {
            if (diceSet.getCurrent(i) != 6) {
                do {
                    diceSet.reroll(i);
                } while ((diceSet.getCurrent(i)) != 6);
            }
        }

        for (int j = 0; j < diceSet.dices.length; j++) {
            System.out.println(diceSet.dices[j]);
        }

    }
}
