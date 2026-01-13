package ljc.array_string;

import ljc.array_string.L002;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L002 移除元素测试")
class L002_Text {

    private final L002 solution = new L002();

    @Test
    @DisplayName("标准用例 1")
    void testExample1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = {2, 2}; // 预期剩下的元素

        int k = solution.removeElement(nums, val);

        assertEquals(expectedNums.length, k, "返回的长度不正确");
        // 排序前 k 个元素进行比较（题目说顺序不重要，所以排序后再比）
        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i], "索引 " + i + " 处的值不正确");
        }
    }

    @Test
    @DisplayName("标准用例 2")
    void testExample2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = {0, 0, 1, 3, 4};

        int k = solution.removeElement(nums, val);

        assertEquals(expectedNums.length, k);
        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}