package ljc.array_string;

import java.util.ArrayList;
import java.util.List;

public class L022 {
    /**
     * Z 字形变换
     * @param s 待转换字符串
     * @param numRows 指定行数
     * @return 转换后的字符串
     */
    public String convert(String s, int numRows) {
        // 1. 边界处理：如果只有一行或者字符串长度小于行数，直接返回原串
        if (numRows < 2 || s.length() <= numRows) {
            return s;
        }

        // 2. 准备“行桶”：创建一个容器来存放每一行的字符
        // 建议：使用 List<StringBuilder> 比直接用数组更容易初始化
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        // --- 核心逻辑区开始 ---

        // 【思路一：标志位法 (推荐)】
        // 你需要一个变量记录当前行 (curRow) 和一个方向旗帜 (flag)
        // 每次把字符存入对应的 rows.get(curRow)
        // 碰到边界就让 flag = -flag
        int curRow = 0;   // 当前所在的行号
        int flag = -1;    // 方向旗帜：控制向上走还是向下走

        // 遍历每一个字符
        for (char c : s.toCharArray()) {
            // 第一步：把字符扔进当前的行桶里
            rows.get(curRow).append(c);

            // 第二步：判断是否需要“转弯”
            // 如果到了第 0 行（顶部）或者第 numRows - 1 行（底部），方向反转
            if (curRow == 0 || curRow == numRows - 1) {
                flag = -flag; // 这里是精髓：1 变 -1，-1 变 1
            }

            // 第三步：更新下一行的位置
            curRow += flag;
        }
        // 【思路二：几何取余法 (你的暴力原思路)】
        // 你需要计算周期 T = 2 * numRows - 2
        // 然后判断 i % T 和 numRows 的关系来决定存入哪一行
        int T = 2 * numRows - 2; // 周期长度
        //理解周期长度向下走了numRow向右走了numRow—2
        for (int i = 0; i < s.length(); i++) {
            int mod = i % T; // 你的取余逻辑

            if (mod < numRows) {
                // 情况 A：向下走，行号就是 mod
                rows.get(mod).append(s.charAt(i));
            } else {
                // 情况 B：对角线向上爬，行号需要反转计算
                rows.get(T - mod).append(s.charAt(i));
            }
        }

        // --- 核心逻辑区结束 ---

        // 3. 结果合并：把所有行桶里的内容按顺序拼接到一起
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }

        return res.toString();
    }
}