package DynamicProgrammingCode;

/**
 * 组合总数
 * 给定一个由正整数组成且不存在重复数字的数组，找出和为给定目标正整数的组合的个数。
 * <p>
 * 示例:
 * <p>
 * nums = [1, 2, 3]
 * target = 4
 * <p>
 * 所有可能的组合为：
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 * <p>
 * 请注意，顺序不同的序列被视作不同的组合。
 * <p>
 * 因此输出为 7。
 */
public class DP_377 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(combintionSum4(nums, 4));
    }

    public static int combintionSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        memo[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    memo[i] += memo[i - nums[j]];
                }
            }
        }
        return memo[target];
    }
}
