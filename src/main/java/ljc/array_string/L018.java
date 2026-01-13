package ljc.array_string;

public class L018 {

    /**
     * L018: 整数转罗马数字
     * 核心逻辑：建立数值与符号的映射，从大到小进行贪心匹配。
     */
    public String intToRoman(int num) {
        // 1. 定义所有可能出现的面值（含减法组合）
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // 2. 定义对应的罗马数字符号
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        // 3. 贪心匹配：从最大的面值开始
        for (int i = 0; i < values.length && num > 0; i++) {
            // 只要当前数字还能扣掉当前面额，就一直扣
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }
}