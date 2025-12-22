package ljc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("L013 除自身以外数组的乘积测试")
class L014_Text {

    private final L013 solution = new L013();

    @Test
    @DisplayName("用例 1: 普通数组")
    void testExample1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    @Test
    @DisplayName("用例 2: 包含负数和零")
    void testExample2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }
}