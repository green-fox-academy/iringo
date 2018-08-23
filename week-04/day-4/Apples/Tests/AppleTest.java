import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
    public void getAppleName() {
        Apple apple = new Apple();
        assertEquals(apple.getAppleName(), "apple");
    }

}