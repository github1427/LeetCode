package ArrayCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数应该返回 true。如果每个元素都不相同，则返回 false。
 */
public class Array_217 {
    public static void main(String[] args) {
        int [] nums={1,2,3,14,12,7,5};
        System.out.println(containDuplicate(nums));
    }

    public static boolean containDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if (set.size()<i+1){
                return true;
            }
        }
        return false;
    }
}
