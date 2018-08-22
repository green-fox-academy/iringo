public class Shifter implements CharSequence {

    private String string;
    private int number;

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return string.charAt();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

}
