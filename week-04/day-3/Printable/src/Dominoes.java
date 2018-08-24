public class Dominoes implements Printable {

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
    public void printAllFields() {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

}