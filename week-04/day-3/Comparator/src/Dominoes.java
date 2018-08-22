import java.util.Arrays;

public class Dominoes implements Comparable {

    private final int[] values;

    public Dominoes(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(values[0], ((Dominoes) o).values[0]);
    }

}