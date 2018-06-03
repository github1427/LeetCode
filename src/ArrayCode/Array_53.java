package ArrayCode;

/**
 * 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class Array_53 {
    public static void main(String[] args) {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        int max=maxSubArray(nums);
        System.out.println(max);
    }
    public static int maxSubArray(int [] nums){
        int sum=nums[0];
        int max=nums[0];
        for (int i=1;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(sum,max);
        }
        return max;
    }
}
