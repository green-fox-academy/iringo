import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(5, extension.add(2, 3));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testAdd_1and6isNot5() {
        assertEquals(7, extension.add(1, 6));
    }


    @Test
    void testMaxOfThree_first() {
        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    void testMaxOfThree_second() {
        assertEquals(5, extension.maxOfThree(3, 4, 5));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(4, extension.maxOfThree(3, 4, 2));
    }

    @Test
    void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7, 5, 3, 5)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    void testMedian_seven() {
        assertEquals(4, extension.median(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testIsVowel_i() {
        assertFalse(extension.isVowel('i') == false);
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }

    @Test
    void testTranslate_alma() {
        assertEquals("avalmava", extension.translate("alma"));
    }
}