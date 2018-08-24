public class Gnirts implements CharSequence {

    private String theString;

    Gnirts(String string) {
        this.theString = string;
    }

    @Override
    public int length() {
        return theString.length();
    }

    @Override
    public char charAt(int index) {
        return theString.charAt((theString.length() - 1) - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
