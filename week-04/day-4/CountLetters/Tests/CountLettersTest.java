import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

    private CountLetters letters;
    private Map<Character, Integer> newletters;

    @Before
    public void createCountletters() {
        letters = new CountLetters();
        newletters = new HashMap<>();
    }

    @Test
    public void countLetter() {
        newletters.put('l', 1);
        newletters.put('e', 2);
        newletters.put('t', 2);
        newletters.put('r', 1);
        newletters.put('s', 1);
        assertEquals(letters.countLetter("letters"), newletters);
    }
}