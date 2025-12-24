package ljc;

/**
 * 014. 最长公共前缀
 * LeetCode: <a href="https://leetcode.com/problems/longest-common-prefix/">...</a>
 */
public class L020 {

    public String longestCommonPrefix(String[] strs) {

        //按列查找
        if (strs == null || strs.length == 0)
            return "";

        String first = strs[0];
        if (first == null)
            return "";

        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                String s = strs[j];
                if (s == null) return ""; // 同上：也可抛异常

                // 其它字符串长度不够 或 当前列字符不一致
                if (i >= s.length() || s.charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }



}
