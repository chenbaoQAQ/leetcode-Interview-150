package ljc.array_string;

import java.util.ArrayList;
import java.util.List;

public class L024 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        int left = 0;

        while (left < n) {
            // 1. 【找边界】：确定这一行最多能放多少个单词
            int right = findRight(words, left, maxWidth);

            // 2. 【分场景排版】：根据是否是最后一行或单单词行，执行不同的填充策略
            res.add(justify(words, left, right, maxWidth, right == n));

            // 下一行从 right 开始
            left = right;
        }
        return res;
    }

    /**
     * 确定从 left 开始，哪些单词可以放进同一行
     */
    private int findRight(String[] words, int left, int maxWidth) {
        int right = left;
        int sumLen = 0;

        while (right < words.length) {
            int wordLen = words[right].length();

            // 1. 计算当前想塞进去的这个词，至少占用多少空间
            // 如果是第一个词，占用 wordLen
            // 如果不是第一个词，占用 (1个保底空格 + wordLen)
            int spaceNeed = (right == left) ? wordLen : (1 + wordLen);

            // 2. 判定：原来的长度 + 新占用的长度，是否超过了箱子宽度？
            if (sumLen + spaceNeed <= maxWidth) {
                // 塞得下！更新总长度
                sumLen += spaceNeed;
                // 门牌号往后挪，准备看下一个词
                right++;
            } else {
                // 塞不下了！跳出循环，把当前的 right 给经理
                break;
            }
        }
        return right;
    }

    /**
     * 执行具体的物理填充逻辑
     */
    private String justify(String[] words, int left, int right, int maxWidth, boolean isLast) {
        StringBuilder sb = new StringBuilder();
        int gapCount = right - left - 1; // 间隙数量

        // 情况 A：最后一行，或者是这一行只有一个单词（左对齐）
        if (isLast || gapCount == 0) {
            for (int i = left; i < right; i++) {
                sb.append(words[i]);
                if (i < right - 1) sb.append(" "); // 单词间只留一个空格
            }
            // 末尾补齐空格到 maxWidth
            fillSpaces(sb, maxWidth - sb.length());
            return sb.toString();
        }

        // 情况 B：普通行（两端对齐，左侧多于右侧）
        int allWordsLen = 0;
        for (int i = left; i < right; i++) allWordsLen += words[i].length(); // 纯单词长度

        int totalSpaces = maxWidth - allWordsLen; // 总共要填补的空格总数

        // --- 核心数学分发逻辑 ---
        int avgSpaces = totalSpaces / gapCount;    // 每个间隙最少分几个
        int extraSpaces = totalSpaces % gapCount;  // 剩下几个“余数”要从左往右分

        for (int i = left; i < right; i++) {
            sb.append(words[i]); // 1. 放单词

            if (i < right - 1) { // 2. 单词后面接间隙（最后一个单词后不接间隙）
                // 基础分配量
                fillSpaces(sb, avgSpaces);

                // 余数补偿：如果当前间隙序号 < extraSpaces，多补一个空格
                if (i - left < extraSpaces) {
                    sb.append(" ");
                }
            }
        }

        return sb.toString();
    }

    private void fillSpaces(StringBuilder sb, int count) {
        for (int i = 0; i < count; i++) sb.append(" ");
    }
}