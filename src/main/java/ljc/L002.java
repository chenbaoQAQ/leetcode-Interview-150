package ljc;

public class L002 {
    public int removeElement(int[] nums, int val) {
        // 1. 定义一个慢指针 slow，用来记录“非 val 元素”应该存放的位置，初始为 0
        int slow = 0;

        // 2. 使用快指针 fast 遍历整个数组
        for (int fast = 0; fast < nums.length; fast++) {

            // 3. 【核心逻辑】如果当前 fast 指向的值 不等于 val：
            if (nums[fast] != val) {
                //    - 把这个值搬到 slow 的位置
                //    - slow 指针向前移动一步
                nums[slow++] = nums[fast];

            }

        }

        // 4. 最后返回 slow，它正好就是新数组的长度
        return slow; // 记得把这里改成正确的返回变量
    }
}