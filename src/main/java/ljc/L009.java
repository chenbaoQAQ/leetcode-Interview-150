package ljc;

public class L009 {
    /**
     * L009: 跳跃游戏
     * 核心逻辑：贪心算法。维护一个当前能达到的最远下标 maxReach。
     */
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // 如果当前位置已经超过了目前能跳到的最远距离，说明断层了
            if (i > maxReach) {
                return false;
            }

            // 更新最远能跳到的位置
            maxReach = Math.max(maxReach, i + nums[i]);

            // 如果最远距离已经超过或到达了最后一个下标，提前返回
            if (maxReach >= n - 1) {
                return true;
            }
        }

        return false;
    }
}