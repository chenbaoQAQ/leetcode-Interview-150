package ljc;

/**
 * L021. 反转字符串中的单词
 * LeetCode: <a href="https://leetcode.com/problems/longest-common-prefix/">...</a>
 */
//    第一步：跳过空格 从后往前走，如果遇到空格就跳过，直到遇到第一个非空格字符。这个位置就是某个单词的末尾（End）。

//    第二步：锁定单词 从 End 开始继续往前走，直到遇到下一个空格（或者字符串到头了）。这个位置就是单词的开头（Start）。

//    第三步：切下并拼接 利用 substring(start, end + 1) 把这个单词切下来，塞进 StringBuilder，然后记得补个空格。

//    第四步：循环 重复上述过程，直到指针走完整个字符串。
public class L021 {
    public String reverseWords(String s) {
        int i = s.length() - 1;
        StringBuilder res = new StringBuilder();

        while (i >= 0) {
            // 1. 跳过空格，找单词尾巴
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;

            int end = i; // 确定单词结尾

            // 2. 找单词开头：只要不是空格，就一直往前走
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // 3. 【核心修正】：跳出内层循环说明单词找完了，一次性切下来
            // substring 是左闭右开，i+1 到 end+1 正好是整个单词
            //+ 号：每次拼接都会创建一张全新的“纸”，把旧内容抄一遍，再写新内容，非常浪费性能。
            //.append()：始终在同一张“纸”上操作，速度极快，是工业级的标准写法
            res.append(s.substring(i + 1, end + 1)).append(" ");
        }

        return res.toString().trim();
    }
}
