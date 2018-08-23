import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci f;

    @Before
    public void createFibonacci() {
        Fibonacci f = new Fibonacci();
    }

    @Test
    public void fibonacciCalculator() {
        assertEquals(f.fibonacciCalculator(4), 2);
    }

    public void fibonacciCalculatorWithNull() {
        assertEquals(f.fibonacciCalculator(4), null);
    }
}