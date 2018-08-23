import java.util.ArrayList;

public class Sum {

    private ArrayList<Integer> listOfNumbers;

    public int sumOfElements(ArrayList<Integer> listOfNumbers) {
        int sum = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            sum += listOfNumbers.get(i);
        }
        return sum;
    }

}
