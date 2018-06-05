package MathCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 错误的集合
 * 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
 * <p>
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,2,4]
 * 输出: [2,3]
 * 注意:
 * <p>
 * 给定数组的长度范围是 [2, 10000]。
 * 给定的数组是无序的。
 */
public class Math_645 {
    public static void main(String[] args) {
        int[] errorNums;
        int[] nums = {1, 2, 2, 4};
        errorNums = findErrorNums(nums);
        for (int i : errorNums) {
            System.out.print(i + " ");
        }
    }

    public static int[] findErrorNums(int[] nums) {
        int[] errorNums = new int[2];
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.add(num)) {
                sum += num;
            } else {
                errorNums[0] = num;
            }
        }
        errorNums[1] = (1 + nums.length) * nums.length / 2 - sum;
        return errorNums;
    }
}
