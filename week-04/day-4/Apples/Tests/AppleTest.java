import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    /*private Apple apple;

    @Before
    public void createApple() {
        Apple apple = new Apple();
    }*/

    @Test
    public void getAppleName() {
        Apple apple = new Apple();
        assertEquals(apple.getAppleName(), "apple");
    }

}