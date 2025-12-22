package ljc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class L019_Text {
    private final L019 solution = new L019();

    @Test
    void testLengthOfLastWord() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }
}