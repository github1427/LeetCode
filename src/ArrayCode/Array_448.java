package ArrayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到所有数组中消失的数字
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * 输出:
 * [5,6]
 */
public class Array_448 {
    public static void main(String[] args) {
        int [] nums={5,4,6,7,9,3,10,9,5,6};
        System.out.println(findDisappearedNumbers2(nums).toString());

    }

    //小白的想法 额外开辟了空间 不符合要求
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumber=new ArrayList<>();
        List<Integer> numberList=new ArrayList<>();
        for (int num:nums){
            numberList.add(num);
        }
        for (int i=1;i<=nums.length;i++){
            if (!(numberList.contains(i))){
                disappearedNumber.add(i);
            }
        }
        return disappearedNumber;
    }

    //大神的代码，唉，人家脑子怎么长的
    public static List<Integer> findDisappearedNumbers2(int [] nums){
        int len =nums.length;
        List<Integer> disappearedNumbers=new ArrayList<>();
        for (int i=0;i<len;i++){
            int val=Math.abs(nums[i])-1;
            if (nums[val]>0){
                nums[val]=-nums[val];
            }
        }
        for (int i =0;i<len;i++){
            if (nums[i]>0){
                disappearedNumbers.add(i+1);
            }
        }
        return disappearedNumbers;
    }
}
