package ArrayCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 最短无序连续子数组
 * <p>
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * <p>
 * 你找到的子数组应是最短的，请输出它的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 */
public class Array_581 {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,3};
        System.out.println(findUnsortedSubarray(nums));
    }

    //其实没必要用list 用一个新的数组就可以了  想法没错。
    public static int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int left =-1, right =-1;
        List<Integer> list=new ArrayList<>();
        for (int num:nums){
            list.add(num);
        }
        Arrays.sort(nums);
        for (int i=0;i<len-1;i++){
            if (nums[i]!=list.get(i)){
                left=i;
                break;
            }
        }
        for (int j=len-1;j>=0;j--){
            if (nums[j]!=list.get(j)){
                right=j;
                break;
            }
        }
        if (left==-1&&right==-1){
            return 0;
        }else{
            return right-left+1;
        }
    }
}
