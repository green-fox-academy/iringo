import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    private Apple apple;

    @Before
    public void createApple() {
        apple = new Apple();
    }

    @Test
    public void getAppleName() {
        assertEquals(apple.getAppleName(), "apple");
    }

}