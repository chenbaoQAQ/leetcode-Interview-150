package ljc;

/**
 * L013: 除自身以外数组的乘积
 */
public class L013 {

    /**
     * 方案一：前缀积 & 后缀积 (我的原始方案)
     * 逻辑：通过两个辅助数组存储左右两侧的累积乘积。
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] answer = new int[n];

        // 计算前缀积
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // 计算后缀积
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // 合并结果
        for (int i = 0; i < n; i++) {
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }

    /**
     * 方案二：空间优化版 (最优解)
     * 核心逻辑：直接在输出数组 answer 中先存前缀积，然后倒序遍历时用一个变量 R 实时累乘后缀。
     */
    public int[] productExceptSelfOptimal(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // 1. 先把 answer 当作 prefix 数组使用
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // 2. 用一个变量 R 动态记录右侧（后缀）的乘积
        int R = 1;
        for (int i = n - 1; i >= 0; i--) {
            // 对于位置 i，当前的 answer[i] 是左侧积，R 是右侧积
            answer[i] = answer[i] * R;
            // 更新 R，包含当前的数字，供左边的一位使用
            R *= nums[i];
        }

        return answer;
    }
}