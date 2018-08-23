import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagram() {
        Anagram a = new Anagram();
        assertTrue(a.anagram("abba", "abba") == true);
    }
}