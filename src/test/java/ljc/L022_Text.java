package ljc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L022 Z 字形变换测试")
class L022_Text {

    private final L022 solution = new L022();

    @Test
    @DisplayName("用例 1: PAYPALISHIRING, rows = 3")
    void testExample1() {
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
    }

    @Test
    @DisplayName("用例 2: PAYPALISHIRING, rows = 4")
    void testExample2() {
        // P     I    N
        // A   L S  I G
        // Y A   H R
        // P     I
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
    }

    @Test
    @DisplayName("用例 3: 只有一行")
    void testExample3() {
        assertEquals("A", solution.convert("A", 1));
    }

    @Test
    @DisplayName("用例 4: 两行的情况")
    void testExample4() {
        // A C E
        // B D
        assertEquals("ACEBD", solution.convert("ABCDE", 2));
    }
}