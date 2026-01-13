package ljc.array_string;

import ljc.array_string.L001;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L001 合并两个有序数组测试")
class L001_Text {

    private final L001 solution = new L001();

    @Test
    @DisplayName("标准合并测试")
    void testStandardMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};

        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1, "合并结果应为 [1, 2, 2, 3, 5, 6]");
    }

    @Test
    @DisplayName("nums1 为空合并测试")
    void testEmptyNums1() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};

        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
}