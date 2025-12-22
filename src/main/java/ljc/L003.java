package ljc;

public class L003 {
    public int removeDuplicates(int[] nums) {
        // 1. 判空处理放在最前面，效率更高
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        // 2. left 指向当前确定的最后一个不重复元素
        int left = 0;

        // 3. right 从 0 开始（或者从 1 开始也可以，从 1 开始能少跑一次循环）
        for (int right = 1; right < n; right++) {
            // 只要发现不同元素
            if (nums[left] != nums[right]) {
                left++; // 慢指针先挪个坑
                nums[left] = nums[right]; // 把新元素填进去
            }
            // 发现相同元素时：只有 right 会在 for 循环中自增，left 不动
        }

        // 4. 返回长度为 索引+1
        return left + 1;
    }
}