package ljc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class L001_Text {
    @Test
    void testMerge() {
        L001 solution = new L001();

        // 测试用例
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, nums1);
    }
}