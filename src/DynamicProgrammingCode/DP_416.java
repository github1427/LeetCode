package DynamicProgrammingCode;

/**
 * Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
 * <p>
 * Note:
 * Each of the array element will not exceed 100.
 * The array size will not exceed 200.
 * Example 1:
 * <p>
 * Input: [1, 5, 11, 5]
 * <p>
 * Output: true
 * <p>
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 * Example 2:
 * <p>
 * Input: [1, 2, 3, 5]
 * <p>
 * Output: false
 * <p>
 * Explanation: The array cannot be partitioned into equal sum subsets.
 */
public class DP_416 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 4};
        System.out.println(canPartition(nums));
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        sum /= 2;
        boolean[][] memo = new boolean[nums.length + 1][sum + 1];
        for (int i = 0; i < memo.length; i++) {
            memo[i][0] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j >= nums[i - 1]) {
                    memo[i][j] = memo[i - 1][j] || memo[i - 1][j - nums[i - 1]];
                } else {
                    memo[i][j] = memo[i - 1][j];
                }
            }
        }
        return memo[nums.length][sum];
    }
}
