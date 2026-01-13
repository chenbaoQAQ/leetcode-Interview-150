package ljc.array_string;

import java.util.Arrays;

public class L011 {

    /**
     * 方案一：排序法 (我的原始思路)
     * 核心逻辑：从小到大排序后，从后往前找“临界点”。
     * 时间复杂度: O(n log n)，主要由于排序开销。
     * 空间复杂度: O(1) 或 O(log n)。
     */
    public int hIndex(int[] citations) {
        // 1. 升序排序
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;

        // 2. 从后往前遍历：n-i 代表“当前是引用次数第几高的论文”
        for (int i = n - 1; i >= 0; i--) {
            int currentPapers = n - i; // 至少有这么多篇论文
            // 如果第 i 篇论文的引用次数 >= 当前统计的论文篇数
            if (citations[i] >= currentPapers) {
                h = currentPapers; // 符合 H 指数定义，更新结果
            } else {
                // 排序后引用次数递减，若当前不满足，前面更小的引用次数肯定也不满足
                break;
            }
        }
        return h;
    }

    /**
     * 方案二：计数排序法 (更优方案)
     * 核心逻辑：利用 H 指数不会超过总论文数 n 的特性，统计每个引用次数的频率。
     * 时间复杂度: O(n)，只需遍历两次数组。
     * 空间复杂度: O(n)，用于计数数组。
     */
    public int hIndexOptimal(int[] citations) {
        int n = citations.length;
        int[] counter = new int[n + 1]; // 用于统计 [0, n] 每个引用次数出现的次数

        // 1. 计数：统计引用次数，超过 n 的全部按 n 处理
        for (int c : citations) {
            if (c >= n) {
                counter[n]++;
            } else {
                counter[c]++;
            }
        }

        // 2. 累加判断：从最大的可能引用次数 n 开始倒序累加
        int totalPapers = 0;
        for (int i = n; i >= 0; i--) {
            totalPapers += counter[i]; // 引用次数 >= i 的论文总数
            if (totalPapers >= i) {
                return i; // 找到最大的 i 满足“有 i 篇论文引用次数 >= i”
            }
        }
        return 0;
    }
}