package ljc.array_string;

import ljc.array_string.L003;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L003 删除有序数组中的重复项测试")
class L003_Text {

    private final L003 solution = new L003();

    @Test
    @DisplayName("用例 1: [1,1,2]")
    void testExample1() {
        int[] nums = {1, 1, 2};
        int k = solution.removeDuplicates(nums);

        assertEquals(2, k);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }

    @Test
    @DisplayName("用例 2: [0,0,1,1,1,2,2,3,3,4]")
    void testExample2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expected = {0, 1, 2, 3, 4};

        int k = solution.removeDuplicates(nums);

        assertEquals(expected.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
}