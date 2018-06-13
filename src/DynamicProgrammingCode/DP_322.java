package DynamicProgrammingCode;

import java.util.Arrays;

/**
 * 零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 * 示例 2:
 * <p>
 * 输入: coins = [2], amount = 3
 * 输出: -1
 * 说明:
 * 你可以认为每种硬币的数量是无限的。
 */
public class DP_322 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int[] coins = {2};
        System.out.println(coinChange(coins, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        long[] memo = new long[amount + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                memo[j] = Math.min(memo[j], memo[j - coin] + 1);
            }
        }
        if (memo[amount] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return (int) memo[amount];
        }
    }
}
