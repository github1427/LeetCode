package ArrayCode;

import java.util.Arrays;

/**
 * 求众数
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class Array_169 {
    public static void main(String[] args) {
        int [] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement2(nums));
    }

    //取巧办法 23333
    public static int majorityElement(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        return nums[len/2];
    }

    //大神们的
    public static int majorityElement2(int [] nums){
        int len=nums.length;
        int sum=1;
        int majority=nums[0];
        for (int i=1;i<len;i++){
            if (majority==nums[i]){
                sum++;
            }else {
                if (sum==1){
                    majority=nums[i];
                }else {
                    sum--;
                }
            }
        }
        return majority;
    }
}
