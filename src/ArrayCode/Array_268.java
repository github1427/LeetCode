package ArrayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 缺失数字
 * 给出一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * <p>
 * 案例 1
 * <p>
 * 输入: [3,0,1]
 * 输出: 2
 * <p>
 * <p>
 * 案例 2
 * <p>
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 */
public class Array_268 {
    public static void main(String[] args) {
        int [] nums={2,1};
        System.out.println(missingNumber2(nums));
    }
    public static int missingNumber(int[] nums){
        List<Integer> list=new ArrayList<>();
        for (int num:nums){
            list.add(num);
        }
        for (int i=0;i<=nums.length;i++){
            if (!list.contains(i)){
                return i;
            }
        }
        return -1;
    }

    //大神们的方法QAQ 我咋就没想到呢
    public static int missingNumber2(int [] nums){
        int len=nums.length;
        int sum=(1+len)*len/2;
        for (int num:nums){
            sum-=num;
        }
        return sum;
    }
}
