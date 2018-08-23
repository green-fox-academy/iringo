import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sumOfElements() {
        Sum number = new Sum();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
        assertEquals(number.sumOfElements(list), 16);
    }

    @Test
    public void sumOfElementsWithEmptyList() {
        Sum number = new Sum();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
        assertEquals(number.sumOfElements(list), 0);
    }

    @Test
    public void sumOfElementsWithOneElement() {
        Sum number = new Sum();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1));
        assertEquals(number.sumOfElements(list), 1);
    }

    @Test
    public void sumOfElementsWithNull() {
        Sum number = new Sum();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(null));
        assertEquals(number.sumOfElements(list), null);
    }

}