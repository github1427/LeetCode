package DynamicProgrammingCode;

/**
 * 一和零
 * 在计算机界中，我们总是追求用有限的资源获取最大的收益。
 * <p>
 * 现在，假设你分别支配着 m 个 0 和 n 个 1。另外，还有一个仅包含 0 和 1 字符串的数组。
 * <p>
 * 你的任务是使用给定的 m 个 0 和 n 个 1 ，找到能拼出存在于数组中的字符串的最大数量。每个 0 和 1 至多被使用一次。
 * <p>
 * 注意:
 * <p>
 * 给定 0 和 1 的数量都不会超过 100。
 * 给定字符串数组的长度不会超过 600。
 * 示例 1:
 * <p>
 * 输入: Array = {"10", "0001", "111001", "1", "0"}, m = 5, n = 3
 * 输出: 4
 * <p>
 * 解释: 总共 4 个字符串可以通过 5 个 0 和 3 个 1 拼出，即 "10","0001","1","0" 。
 * 示例 2:
 * <p>
 * 输入: Array = {"10", "0", "1"}, m = 1, n = 1
 * 输出: 2
 * <p>
 * 解释: 你可以拼出 "10"，但之后就没有剩余数字了。更好的选择是拼出 "0" 和 "1" 。
 */
public class DP_474 {
    public static void main(String[] args) {
        String[] strings = {"10", "0001", "111001", "1", "0"};
        System.out.println(findMaxForm(strings, 5, 3));
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        int[] nums0 = new int[strs.length];
        int[] nums1 = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) == '0') {
                    nums0[i]++;
                } else {
                    nums1[i]++;
                }
            }
        }
        int[][][] memo = new int[strs.length + 1][m + 1][n + 1];
        for (int i = 1; i <= strs.length; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    if (j >= nums0[i - 1] && k >= nums1[i - 1]) {
                        memo[i][j][k] = Math.max(memo[i - 1][j][k], memo[i - 1][j - nums0[i - 1]][k - nums1[i - 1]] + 1);
                    } else {
                        memo[i][j][k] = memo[i - 1][j][k];
                    }
                }
            }
        }
        return memo[strs.length][m][n];
    }
}
