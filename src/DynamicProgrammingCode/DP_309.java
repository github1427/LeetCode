package DynamicProgrammingCode;

/**
 * 最佳买卖股票时机，含冷冻期
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 * <p>
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 * <p>
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 * 示例:
 * <p>
 * 输入: [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 */
public class DP_309 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0) {
            return 0;
        }
        int[] buy = new int[len];
        int[] sell = new int[len];
        int[] rest = new int[len];
        buy[0] = -prices[0];
        sell[0] = 0;
        rest[0] = 0;
        for (int i = 1; i < len; i++) {
            buy[i] = Math.max(buy[i - 1], rest[i - 1] - prices[i]);
            sell[i] = buy[i - 1] + prices[i];
            rest[i] = Math.max(sell[i - 1], rest[i - 1]);
        }
        return Math.max(sell[len - 1], rest[len - 1]);
    }
}
