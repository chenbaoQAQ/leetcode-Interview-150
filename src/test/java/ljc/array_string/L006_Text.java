package ljc.array_string;

import ljc.array_string.L006;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L006 轮转数组测试")
class L006_Text {

    private final L006 solution = new L006();

    @Test
    @DisplayName("用例 1: k = 3")
    void testExample1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    @DisplayName("用例 2: k = 2")
    void testExample2() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] expected = {3, 99, -1, -100};
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}