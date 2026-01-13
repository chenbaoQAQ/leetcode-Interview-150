package ljc.array_string;

public class L006 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // 1. 处理 k 大于数组长度的情况，取余数
        k %= n;
        if (k == 0) return;

        // 2. 三步反转法：
        // 第一步：反转整个数组 [1,2,3,4,5,6,7] -> [7,6,5,4,3,2,1]
        reverse(nums, 0, n - 1);
        // 第二步：反转前 k 个元素 [7,6,5,4,3,2,1] -> [5,6,7,4,3,2,1]
        reverse(nums, 0, k - 1);
        // 第三步：反转剩余元素 [5,6,7,4,3,2,1] -> [5,6,7,1,2,3,4]
        reverse(nums, k, n - 1);
    }

    /**
     * 辅助方法：原地反转数组指定范围
     */
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}