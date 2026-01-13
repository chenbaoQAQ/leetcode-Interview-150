package ljc.array_string;

import ljc.array_string.L011;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L011 H 指数测试")
class L011_Text {

    private final L011 solution = new L011();

    @Test
    @DisplayName("用例 1: 混合引用次数")
    void testExample1() {
        int[] citations = {3, 0, 6, 1, 5};
        assertEquals(3, solution.hIndex(citations));
    }

    @Test
    @DisplayName("用例 2: 低引用次数")
    void testExample2() {
        int[] citations = {1, 3, 1};
        assertEquals(1, solution.hIndex(citations));
    }
}