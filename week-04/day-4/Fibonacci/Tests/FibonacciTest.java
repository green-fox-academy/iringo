import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci f;

    @Before
    public void createFibonacci() {
        f = new Fibonacci();
    }

    @Test
    public void fibonacciCalculator() {
        assertEquals(f.fibonacciCalculator(2), 1);
    }

    @Test
    public void fibonacciCalculatorWithNull() {
        assertEquals(f.fibonacciCalculator(4), null);
    }
}