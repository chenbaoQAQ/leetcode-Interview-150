package ljc.array_string;

public class L023 {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // 只需要遍历到 n - m 的位置即可，后面长度不够了肯定匹配不上
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            // 尝试匹配 needle
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // 如果 j 走到了 needle 的末尾，说明全部匹配成功
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}