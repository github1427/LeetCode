package ArrayCode;

import java.util.Arrays;

/**
 * 三个数的最大乘积
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: 6
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: 24
 */
public class Array_628 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        System.out.println(maxiumProduct(nums));
    }

    public static int maxiumProduct(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        return Math.max(nums[len-3]*nums[len-2]*nums[len-1],nums[0]*nums[1]*nums[len-1]);
    }
}
