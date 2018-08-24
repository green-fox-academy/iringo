import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    private Sharpie sharpie;

    @Before
    public void createSharpie() {
        sharpie = new Sharpie("red", 10);
    }

    @Test
    public void useWithCorrectOutcome() {
        assertEquals(sharpie.use(40), 60, 0.05);
    }

    @Test
    public void useWithWrongOutcome() {
        assertEquals(sharpie.use(40), 50, 0.05);
    }

    @Test
    public void useWithNullOutcome() {
        assertEquals(sharpie.use(60), 0, 0.05);
    }
}