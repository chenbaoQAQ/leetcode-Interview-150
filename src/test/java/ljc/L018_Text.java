package ljc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L018 整数转罗马数字测试")
class L018_Text {

    private final L018 solution = new L018();

    @Test
    @DisplayName("用例 1: 基础累加案例")
    void testExample1() {
        assertEquals("III", solution.intToRoman(3));
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    @DisplayName("用例 2: 包含减法规则案例")
    void testExample2() {
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("IX", solution.intToRoman(9));
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    @DisplayName("用例 3: 边界大数字")
    void testExample3() {
        // 3999 是该规则下的常用上限
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }
}