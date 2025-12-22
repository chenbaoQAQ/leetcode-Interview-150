package ljc;

public class L015 {
    /**
     * L015: 分发糖果
     * 你的思路：
     * 1. 从左到右遍历，满足“右边比左边大”的条件。
     * 2. 从右到左遍历，满足“左边比右边大”的条件。
     * 3. 取左右两遍遍历结果的最大值，确保同时满足两个相邻方向的限制。
     */
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];

        // 第一遍：从左往右，处理右边孩子比左边评分高的情况
        for (int i = 0; i < n; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        int right = 0; // 记录当前孩子在“从右往左看”时应得的糖果
        int totalCandies = 0;

        // 第二遍：从右往左，处理左边孩子比右边评分高的情况
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            // 核心：取左右规则中的最大值，汇总到总结果
            totalCandies += Math.max(left[i], right);
        }

        return totalCandies;
    }
}