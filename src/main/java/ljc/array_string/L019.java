package ljc.array_string;

public class L019 {
    /**
     * L019: 最后一个单词的长度
     * 核心逻辑：
     * 1. 从后往前遍历，首先跳过字符串末尾可能存在的空格。
     * 2. 继续向前遍历，直到遇到空格或到达字符串起始位置，计数的长度即为最后一个单词的长度。
     */
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        // 1. 跳过末尾空格
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 2. 统计最后一个单词的字母数量
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}