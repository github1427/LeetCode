package ArrayCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 存在重复II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使 nums [i] = nums [j]，并且 i 和 j 的绝对差值最大为 k。
 */
public class Array_219 {
    public static void main(String[] args) {
        int [] nums={1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums,1));
    }

    //超时 。。。。
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int len=nums.length;
        if (k>=len){
            k=len-1;
        }
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<len;i++){
            if (!list.contains(nums[i])){
                list.add(nums[i]);
            }else {
                if (i-list.indexOf(nums[i])<=k){
                    return true;
                }
                list.set(list.indexOf(nums[i]),null);
                list.add(nums[i]);
            }
        }
        return false;
    }

    //大神的想法
    public static boolean containNearbyDuplicate2(int [] nums,int k){
        int len=nums.length;
        Set<Integer> set =new HashSet<>();
        if (k>=len){
            k=len-1;
        }
        for(int i=0;i<len;i++){
            if (i>k){
                set.remove(nums[i-k-1]);
            }
            if (!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
