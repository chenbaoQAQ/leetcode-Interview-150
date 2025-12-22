package ljc;

import java.util.HashMap;
import java.util.Map;

public class L017 {
    /**
     * L017: 罗马数字转整数
     * 核心逻辑：从后往前遍历。
     * 1. 记录右侧出现过的最大值（或仅对比紧邻的右侧值）。
     * 2. 如果当前值 < 右侧值，说明是特殊减法规则（如 IV），减去当前值。
     * 3. 否则，加上当前值。
     */
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int n = s.length();
        // 最后一个数字总是加上的
        int lastValue = map.get(s.charAt(n - 1));
        ans += lastValue;

        // 从倒数第二个开始往前走
        for (int i = n - 2; i >= 0; i--) {
            int currentValue = map.get(s.charAt(i));
            // 关键：如果当前比右边的小，执行减法
            if (currentValue < lastValue) {
                ans -= currentValue;
            } else {
                ans += currentValue;
            }
            // 更新右侧参考值
            lastValue = currentValue;
        }

        return ans;
    }
}