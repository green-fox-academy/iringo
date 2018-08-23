public class CountLetters {

    private String string;

    public void countLetters(String string) {

        char[] sorted = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            sorted[i] = string.charAt(i);
            int counter = 1;
            for (int j = i + 1; j < string.length(); j++) {
                if (sorted[i] == string.charAt(j)) {
                    counter++;
                }
            }
            System.out.println("number of occurence of" + " " + sorted[i] + " " + "is: " + counter);
        }
    }

}
