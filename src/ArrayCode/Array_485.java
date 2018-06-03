package ArrayCode;

/**
 * 最大连续1的个数
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 */
public class Array_485 {
    public static void main(String[] args) {
        int [] nums={1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int len=nums.length;
        int max=0;
        int count=0;
        for (int i=0;i<len;i++){
            if (nums[i]!=1){
                max=Math.max(max,count);
                count=0;
            }else {
                count++;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}
