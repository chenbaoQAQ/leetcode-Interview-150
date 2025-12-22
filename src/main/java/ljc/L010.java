package ljc;

public class L010 {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0; // 如果就在起点，0步

        int maxreach = 0; // 你的核心逻辑：全局最远能跳到哪
        int steps = 0;    // 我们要找的结果：最少跳了几次
        int end = 0;      // 关键点：当前这一跳最远能管到哪

        // 注意：我们只遍历到 n-2（倒数第二个），因为到达最后一位不需要再起跳
        for (int i = 0; i < n - 1; i++) {
            // 依然使用你的贪心逻辑更新最远距离
            maxreach = Math.max(maxreach, i + nums[i]);

            // 【新逻辑】：当我们走到了当前这一跳的“尽头”时
            if (i == end) {
                steps++;      // 必须再跳一次才能继续前进
                end = maxreach; // 下一跳的最远边界，就是我们刚才探测到的 maxreach
            }
        }
        return steps;
    }
}