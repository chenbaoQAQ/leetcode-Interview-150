package ljc.array_string;

public class L014 {
    /**
     * L014: 加油站
     * 核心逻辑：
     * 1. 如果总 gas 小于总 cost，无论从哪出发都跑不完一圈。
     * 2. 如果从 A 到不了 B，那么 A 和 B 之间的任何一个站都不可能作为起点。
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSum = 0;   // 记录全程总净油量
        int currentSum = 0; // 记录从当前起点开始的净油量
        int start = 0;      // 潜在的起点

        for (int i = 0; i < gas.length; i++) {
            int net = gas[i] - cost[i];
            totalSum += net;
            currentSum += net;

            // 如果当前净油量为负，说明之前的起点 start 无法到达下一站
            if (currentSum < 0) {
                // 将起点尝试设为下一站，并重置当前油量
                start = i + 1;
                currentSum = 0;
            }
        }

        // 最后根据总净油量判断是否有解
        return totalSum >= 0 ? start : -1;
    }
}