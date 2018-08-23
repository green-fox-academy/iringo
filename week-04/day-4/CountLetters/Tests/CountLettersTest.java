import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

    private CountLetters c;

    @Before
    public void createCountletters() {
        CountLetters c = new CountLetters();
    }

    @Test
    public void countLetter() {
        c.countLetter("letter");

    }
}