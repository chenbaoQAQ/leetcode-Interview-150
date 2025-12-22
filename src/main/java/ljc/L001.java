package ljc;

import java.util.Arrays;

public class L001 {

    /**
     * 解法一：合并后排序 (我的原始思路)
     * 优点：代码简洁，逻辑清晰
     * 时间复杂度: O((m+n) log(m+n))
     */
    public void mergeV1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    /**
     * 解法二：逆向双指针
     * 优点：不需要额外的排序时间，直接在一次遍历中完成
     * 时间复杂度: O(m+n)
     * 空间复杂度: O(1)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;       // nums1 的有效数据末尾
        int p2 = n - 1;       // nums2 的末尾
        int tail = m + n - 1; // nums1 的总末尾（待填充位置）

        // 只要 nums2 还有数据，就需要合并
        while (p2 >= 0) {
            // 如果 nums1 还有数据且当前数比 nums2 大，把 nums1 的数挪到后面
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[tail--] = nums1[p1--];
            } else {
                // 否则，把 nums2 的数挪到后面
                nums1[tail--] = nums2[p2--];
            }
        }
    }
}