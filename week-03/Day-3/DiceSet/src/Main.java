public class Main {

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        for (int i = 0; i < 6; i++) {
            diceSet.getCurrent();
            diceSet.roll();
            diceSet.getCurrent();
            diceSet.getCurrent(5);
            diceSet.reroll();
            diceSet.getCurrent();
            diceSet.reroll(4);
            diceSet.getCurrent();
        }

    }
}
