package DynamicProgrammingCode;

/**
 * 完全平方数
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 * 示例 2:
 * <p>
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 */
public class DP_279 {
    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }

    public static int numSquares(int n) {
        int[] count = new int[n + 1];
        for (int i = 0; i < count.length; i++) {
            count[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                count[i] = Math.min(count[i], count[i - j * j] + 1);
            }
        }
        return count[n];
    }
}
