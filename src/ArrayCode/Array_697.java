package ArrayCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组的度
 * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 * <p>
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1, 2, 2, 3, 1]
 * 输出: 2
 * 解释:
 * 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
 * 连续子数组里面拥有相同度的有如下所示:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * 最短连续子数组[2, 2]的长度为2，所以返回2.
 * 示例 2:
 * <p>
 * 输入: [1,2,2,3,1,4,2]
 * 输出: 6
 */
public class Array_697 {
    public static void main(String[] args) {
        int[] nums={1,3,2,2,2,1,1,3,1,1,2};
        System.out.println(findShortestSubArray(nums));
    }

    public static int findShortestSubArray(int[] nums) {
        int len=nums.length;
        if (len==0){
            return 0;
        }
        int[] numsCopy=nums.clone();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int maxCount=1;
        int minLength=len;
        int count=1;
        int left=0,right=0;
        for (int i=0;i<len-1;i++){
            if (nums[i]==nums[i+1]){
                count++;
            }else {
                if (count>maxCount){
                    maxCount=count;
                    list.clear();
                    list.add(nums[i]);
                }else if (count==maxCount){
                    list.add(nums[i]);
                }
                count=1;
            }
        }
        if (count>maxCount){
            list.clear();
            list.add(nums[len-1]);
        }else if (count==maxCount){
            list.add(nums[len-1]);
        }
        for (Integer num:list){
            for (int i=0;i<len;i++){
                if (numsCopy[i]==num){
                    left=i;
                    break;
                }
            }
            for (int j=len-1;j>=0;j--){
                if (numsCopy[j]==num){
                    right=j;
                    break;
                }
            }
            minLength=Math.min(minLength,right-left+1);
        }
        return minLength;

    }
}
