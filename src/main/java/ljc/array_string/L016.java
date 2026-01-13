package ljc.array_string;

public class L016 {
    /**
     * L016: 接雨水
     * 你的思路：
     * 1. 找凹槽：存水量由左右两边“较低”的那一边决定。
     * 2. 双指针：从左右两端开始移动，每次移动较矮的那一侧。
     * 3. 动态更新：如果当前高度小于侧边最大高度，则产生存水；否则更新侧边最大高度。
     */
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];   // 记录左侧扫过的最高墙
        int rightMax = height[right]; // 记录右侧扫过的最高墙
        int water = 0;

        while (left < right) {
            // 木桶效应：谁矮谁决定上限，移动较矮的一边
            if (leftMax < rightMax) {
                left++;
                // 如果当前位置比左侧最高墙矮，说明形成了“凹槽”
                if (leftMax > height[left]) {
                    water += leftMax - height[left];
                } else {
                    // 否则，当前位置成了新的左侧最高墙
                    leftMax = height[left];
                }
            } else {
                right--;
                // 同理处理右侧
                if (rightMax > height[right]) {
                    water += rightMax - height[right];
                } else {
                    rightMax = height[right];
                }
            }
        }

        return water;
    }
}