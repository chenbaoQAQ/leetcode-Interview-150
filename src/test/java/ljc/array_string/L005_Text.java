package ljc.array_string;

import ljc.array_string.L005;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L005 多数元素测试")
class L005_Text {

    private final L005 solution = new L005();

    @Test
    @DisplayName("用例 1: [3,2,3]")
    void testExample1() {
        int[] nums = {3, 2, 3};
        assertEquals(3, solution.majorityElement(nums));
    }

    @Test
    @DisplayName("用例 2: [2,2,1,1,1,2,2]")
    void testExample2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, solution.majorityElement(nums));
    }
}