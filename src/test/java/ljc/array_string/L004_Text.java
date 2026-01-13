package ljc.array_string;

import ljc.array_string.L004;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L004 删除有序数组中的重复项 II 测试")
class L004_Text {

    private final L004 solution = new L004();

    @Test
    @DisplayName("用例 1: [1,1,1,2,2,3]")
    void testExample1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] expected = {1, 1, 2, 2, 3};
        int k = solution.removeDuplicates(nums);

        assertEquals(expected.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    @DisplayName("用例 2: [0,0,1,1,1,1,2,3,3]")
    void testExample2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] expected = {0, 0, 1, 1, 2, 3, 3};
        int k = solution.removeDuplicates(nums);

        assertEquals(expected.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
}