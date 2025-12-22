package ljc;

import java.util.*;

public class L012 {
    /**
     * L012: O(1) 时间插入、删除和获取随机元素
     * 我的思路：
     * 1. HashMap 用于 O(1) 查找元素在数组中的索引位置。
     * 2. ArrayList 用于 O(1) 时间根据索引随机访问元素。
     * 3. 交换法删除：把数组最后的元素搬到待删处，只删最后一位，避免 O(n) 的位移。
     */
    public static class RandomizedSet {
        private List<Integer> nums;
        private Map<Integer, Integer> hashmap;
        private Random random;

        public RandomizedSet() {
            nums = new ArrayList<>();
            hashmap = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (hashmap.containsKey(val)) {
                return false;
            }
            // 记录索引并添加到数组末尾
            hashmap.put(val, nums.size());
            nums.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!hashmap.containsKey(val)) {
                return false;
            }

            // 1. 核心技巧：获取待删元素的索引，以及数组最后一个元素的值
            int index = hashmap.get(val);
            int lastVal = nums.get(nums.size() - 1);

            // 2. 覆盖：把最后一个元素放到待删除的位置
            nums.set(index, lastVal);

            // 3. 更新：同步更新哈希表中被移动元素的索引
            hashmap.put(lastVal, index);

            // 4. 清理：物理移除数组最后一位和哈希表中的 key
            nums.remove(nums.size() - 1);
            hashmap.remove(val);

            return true;
        }

        public int getRandom() {
            // 变量命名建议：randomIndex 代表抽中的索引，result 代表返回的结果
            int randomIndex = random.nextInt(nums.size());
            return nums.get(randomIndex);
        }
    }
}