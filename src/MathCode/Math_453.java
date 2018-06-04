package MathCode;

import java.util.Arrays;

/**
 * 最小的移动次数使数组相等
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [1,2,3]
 * <p>
 * 输出:
 * 3
 * <p>
 * 解释:
 * 只需要3次移动（注意每次移动会增加两个元素的值）：
 * <p>
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
public class Math_453 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 9, 10};
        System.out.println(minMoves(nums));
    }

    //渣渣方法，超时
    public static int minMoves(int[] nums) {
        int len = nums.length;
        int minMoves = 0;
        Arrays.sort(nums);
        int countMax = count(nums);
        if (countMax == len) {
            return 0;
        }
        while (countMax < len) {
            minMoves += (nums[len - countMax] - nums[len - countMax - 1]) * countMax;
            nums[len - countMax - 1] += minMoves;
            for (int i = len - countMax; i < len; i++) {
                nums[i] = Math.max(nums[i - 1], nums[i]);
            }
            countMax = count(nums);
            addOne(nums, countMax, minMoves);
        }
        return minMoves;


    }

    private static int count(int[] nums) {
        int count = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                count++;
            }
        }
        return count;
    }

    private static void addOne(int[] nums, int count, int moves) {
        for (int i = 0; i < nums.length - count; i++) {
            nums[i] += moves;
        }
    }

    //大神们的，这是个数学计算 sum+minMoves*(n-1)=(minNum+minMoves)*n
    public static int minMoves1(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int num1 : nums) {
            sum += num1;
        }
        int minMoves = 0;
        int minNum = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < minNum) {
                minNum = num;
            }
        }

        minMoves = sum - minNum * len;
        return minMoves;
    }

}
