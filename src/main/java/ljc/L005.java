package ljc;

import java.util.Arrays;

public class L005 {
    /**
     * 多数元素：寻找数组中出现次数大于 n/2 的元素
     * 采用摩尔投票算法 (Boyer-Moore Voting Algorithm)
     */
    public int majorityElement(int[] nums) {
        // 候选人初始化为第一个数，票数为 1
        int count = 1;
        int candidate = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                // 当之前的票数抵消完了，更换新的候选人
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                // 遇到同类，票数增加
                count++;
            } else {
                // 遇到异类，票数抵消
                count--;
            }
        }
        return candidate;
    }
}