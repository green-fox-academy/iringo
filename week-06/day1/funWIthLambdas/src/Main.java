import java.awt.*;
import java.sql.SQLOutput;
import java.util.concurrent.Flow;
import java.util.function.*;

public class Main {


    public static void main(String[] args) {

        Function <Integer, Integer> inc = numbers -> numbers + 1; // Shift F6
        int a = inc.apply(5);

        Consumer print = System.out::println; // kérem a referenciát erre a függvényre
        print.accept(5);

        IntBinaryOperator add = (x, y) -> x + y;

        Function <Integer, Integer> increment = Main::increment;
        increment.apply(6);


        IntSupplier rand = () -> 4;
        BooleanSupplier truthTeller = () -> true;

        Predicate<Integer> isPositive = number -> number > 0; // Itt nem jön létre másolat, mert Integer t0pust adtam, míg az IntPredicate-nél int van.


    }

    static int increment (int number) {
        return number + 1;
    }

}
