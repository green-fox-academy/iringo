import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// You have the list of Dominoes
// Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
// eg: [2, 4], [4, 3], [3, 5] ...

public class Main {

    public static void main(String[] args) {

        List<Dominoes> dominoes = initializeDominoes();
        List<Integer> tempList = new ArrayList<Integer>(dominoes.size());

        for (int i = 0; i < dominoes.size(); i++) {
            for (int j = i + 1; j < dominoes.size(); j++) {
                if (dominoes.get(i).getValues()[0] == dominoes.get(j).getValues()[1]) {
                    Collections.swap(dominoes, i, j + 1);
                }
            }
        }

        System.out.println(dominoes);
    }

    static List<Dominoes> initializeDominoes() {
        List<Dominoes> dominoes = new ArrayList<>();
        dominoes.add(new Dominoes(5, 2));
        dominoes.add(new Dominoes(4, 6));
        dominoes.add(new Dominoes(1, 5));
        dominoes.add(new Dominoes(6, 7));
        dominoes.add(new Dominoes(2, 4));
        dominoes.add(new Dominoes(7, 1));
        return dominoes;
    }

}
