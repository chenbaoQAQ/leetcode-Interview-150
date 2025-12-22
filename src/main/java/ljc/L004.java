package ljc;

public class L004 {

    /**
     * 解法一：计数模拟法 (我的第一套代码)
     * 思路：用一个 count 记录当前数字出现的次数，只要次数 <= 2，就搬运。
     * 优点：非常符合直觉，即使数组无序（通过哈希表）也能改写。
     */
    public int removeDuplicatesV1(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int left = 0;   // 慢指针，指向已确定的位置
        int count = 1;  // 记录当前数字出现的频率
        int n = nums.length;

        for (int right = 1; right < n; right++) {
            // 如果和前一个相等，累加计数器；否则重置为 1
            if (nums[right] == nums[right - 1]) {
                count++;
            } else {
                count = 1;
            }

            // 核心判断：只要出现的次数还在允许范围内（2次），就更新慢指针并覆盖
            if (count <= 2) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

    /**
     * 解法二：跨步检查法 (我的第二套代码 )
     * 思路：利用有序性，直接跳过 2 个位置对比。只要当前数不等于“要填入位置的前前个数字”，就说明还没到 3 个。
     * 优点：代码极其精简，不需要额外的计数器变量。
     */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int slow = 2, fast = 2;
        while (fast < n) {
            // 关键：检查 fast 指向的值，是否和已经排好的队列中倒数第二个值相等
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}