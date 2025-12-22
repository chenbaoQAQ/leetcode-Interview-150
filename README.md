# LeetCode 面试经典 150 题 (Java)

本项目是基于 Java 17 的算法实践，严格遵循工业级代码规范，包含完整的单元测试。

## 🛠️ 环境配置
- **语言**: Java 17
- **构建工具**: Maven
- **包名规范**: `ljc`
- **测试框架**: JUnit 5
## 📈 刷题进度记录

| 序号 | 题目 | 难度 | 核心解法 | 代码 | 测试用例 |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 001 | [88. 合并两个有序数组](./src/main/java/ljc/L001.md) | 🟢 简单 | 逆向双指针 | [L001.java](./src/main/java/ljc/L001.java) | [L001_Text.java](./src/test/java/ljc/L001_Text.java) |
| 002 | [27. 移除元素](./src/main/java/ljc/L002.md) | 🟢 简单 | 快慢指针 | [L002.java](./src/main/java/ljc/L002.java) | [L002_Text.java](./src/test/java/ljc/L002_Text.java) |
| 003 | [26. 删除有序数组中的重复项](./src/main/java/ljc/L003.md) | 🟢 简单 | 双指针去重 | [L003.java](./src/main/java/ljc/L003.java) | [L003_Text.java](./src/test/java/ljc/L003_Text.java) |
| 004 | [80. 删除有序数组中的重复项 II](./src/main/java/ljc/L004.md) | 🟡 中等 | 扩展快慢指针 | [L004.java](./src/main/java/ljc/L004.java) | [L004_Text.java](./src/test/java/ljc/L004_Text.java) |
| 005 | [169. 多数元素](./src/main/java/ljc/L005.md) | 🟢 简单 | 摩尔投票法 | [L005.java](./src/main/java/ljc/L005.java) | [L005_Text.java](./src/test/java/ljc/L005_Text.java) |
| 006 | [189. 轮转数组](./src/main/java/ljc/L006.md) | 🟡 中等 | 数组翻转技巧 | [L006.java](./src/main/java/ljc/L006.java) | [L006_Text.java](./src/test/java/ljc/L006_Text.java) |
| 007 | [121. 买卖股票的最佳时机](./src/main/java/ljc/L007.md) | 🟢 简单 | 一次遍历找低位 | [L007.java](./src/main/java/ljc/L007.java) | [L007_Text.java](./src/test/java/ljc/L007_Text.java) |
| 008 | [122. 买卖股票的最佳时机 II](./src/main/java/ljc/L008.md) | 🟡 中等 | 贪心算法累加收益 | [L008.java](./src/main/java/ljc/L008.java) | [L008_Text.java](./src/test/java/ljc/L008_Text.java) |
| 009 | [55. 跳跃游戏](./src/main/java/ljc/L009.md) | 🟡 中等 | 贪心维护最远距离 | [L009.java](./src/main/java/ljc/L009.java) | [L009_Text.java](./src/test/java/ljc/L009_Text.java) |
| 010 | [45. 跳跃游戏 II](./src/main/java/ljc/L010.md) | 🟡 中等 | 贪心记录步数界限 | [L010.java](./src/main/java/ljc/L010.java) | [L010_Text.java](./src/test/java/ljc/L010_Text.java) |
| 011 | [274. H 指数](./src/main/java/ljc/L011.md) | 🟡 中等 | 计数排序 / 桶思想 | [L011.java](./src/main/java/ljc/L011.java) | [L011_Text.java](./src/test/java/ljc/L011_Text.java) |
| 012 | [380. O(1) 时间插入、删除和获取随机元素](./src/main/java/ljc/L012.md) | 🟡 中等 | 哈希表 + 动态数组 | [L012.java](./src/main/java/ljc/L012.java) | [L012_Text.java](./src/test/java/ljc/L012_Text.java) |
| 013 | [238. 除自身以外数组的乘积](./src/main/java/ljc/L013.md) | 🟡 中等 | 前缀积 & 后缀积 | [L013.java](./src/main/java/ljc/L013.java) | [L013_Text.java](./src/test/java/ljc/L013_Text.java) |
| 014 | [134. 加油站](./src/main/java/ljc/L014.md) | 🟡 中等 | 贪心算法 / 剩余油量状态 | [L014.java](./src/main/java/ljc/L014.java) | [L014_Text.java](./src/test/java/ljc/L014_Text.java) |
| 015 | [135. 分发糖果](./src/main/java/ljc/L015.md) | 🔴 困难 | 双向贪心扫描 | [L015.java](./src/main/java/ljc/L015.java) | [L015_Text.java](./src/test/java/ljc/L015_Text.java) |
| 016 | [42. 接雨水](./src/main/java/ljc/L016.md) | 🔴 困难 | 双指针 / 木桶效应 | [L016.java](./src/main/java/ljc/L016.java) | [L016_Text.java](./src/test/java/ljc/L016_Text.java) |
| 017 | [13. 罗马数字转整数](./src/main/java/ljc/L017.md) | 🟢 简单 | 反向遍历减法规则 | [L017.java](./src/main/java/ljc/L017.java) | [L017_Text.java](./src/test/java/ljc/L017_Text.java) |
| 018 | [12. 整数转罗马数字](./src/main/java/ljc/L018.md) | 🟡 中等 | 贪心数值匹配 | [L018.java](./src/main/java/ljc/L018.java) | [L018_Text.java](./src/test/java/ljc/L018_Text.java) |
| 019 | [58. 最后一个单词的长度](./src/main/java/ljc/L019.md) | 🟢 简单 | 反向扫描计数 | [L019.java](./src/main/java/ljc/L019.java) | [L019_Text.java](./src/test/java/ljc/L019_Text.java) |
---
*最近更新于: 2025-12-22*