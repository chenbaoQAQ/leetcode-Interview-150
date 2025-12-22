package ljc;


public class L001 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;       // nums1 的有效末尾
        int p2 = n - 1;       // nums2 的末尾
        int tail = m + n - 1; // nums1 的总末尾

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[tail--] = nums1[p1--];
            } else {
                nums1[tail--] = nums2[p2--];
            }
        }
    }
}