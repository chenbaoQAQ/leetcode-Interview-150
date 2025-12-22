package ljc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L017 罗马数字转整数测试")
class L017_Text {

    private final L017 solution = new L017();

    @Test
    @DisplayName("用例 1: 基础加法 (III)")
    void testExample1() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    @DisplayName("用例 2: 包含减法组合 (IV, IX)")
    void testExample2() {
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
    }

    @Test
    @DisplayName("用例 3: 复杂组合 (MCMXCIV)")
    void testExample3() {
        // M=1000, CM=900, XC=90, IV=4
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}