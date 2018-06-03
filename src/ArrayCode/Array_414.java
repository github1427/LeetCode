package ArrayCode;

import java.util.Set;
import java.util.TreeSet;

/**
 * 第三大的数
 * 输入: [3, 2, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 第三大的数是 1.
 * 示例 2:
 * <p>
 * 输入: [1, 2]
 * <p>
 * 输出: 2
 * <p>
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 * <p>
 * 输入: [2, 2, 3, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */
public class Array_414 {
    public static void main(String[] args) {
        int[]nums={2,2,3,1};
        System.out.println(thirdMax(nums));
    }

    //小白方法
    public static int thirdMax(int [] nums){
        Set<Integer> set=new TreeSet<>();
        for (int num:nums){
            set.add(num);
        }
        Object [] objects=set.toArray();
        if (objects.length>=3){
            return (int) objects[objects.length-3];
        }else {
            return (int) objects[objects.length-1];
        }
    }

    //大神方法

}
