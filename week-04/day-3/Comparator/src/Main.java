import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Dominoes> dominoes = new ArrayList<>();
        dominoes.add(new Dominoes(5, 2));
        dominoes.add(new Dominoes(4, 6));
        dominoes.add(new Dominoes(1, 5));
        dominoes.add(new Dominoes(6, 7));
        dominoes.add(new Dominoes(2, 4));
        dominoes.add(new Dominoes(7, 1));

        Collections.sort(dominoes);
        for (int i = 0; i < dominoes.size(); i++) {
            System.out.println(dominoes.get(i));
        }

        Thing newThing = new Thing("thingy");
        newThing.complete();

    }

}