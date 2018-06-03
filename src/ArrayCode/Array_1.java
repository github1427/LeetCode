package ArrayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 两数之和
 * <p>
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * <p>
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */

// 我的思路：将nums数组转换成list，然后从头开始遍历，每遍历到一处，判断list中是否含有（target-nums[i]）的数，并且同时防止target-nums[i]与
// nums[i]相同的情况，此时将i赋给solution[0]，调用list的indexof方法，将结果赋值给solution[1] break

// 高票答案：逆向思维，初始化一个map，遍历数组，每遍历到一处，若map中包含target-nums[i]，则说明结果已找出，赋值索引，若不包含，则将其值与索引添加到
// map中。
public class Array_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] solution = twoSum(nums, 9);
        System.out.println(solution[0] + "  " + solution[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(target - nums[i])) {
                if (list.indexOf(target - nums[i]) != i) {
                    solution[0] = i;
                    solution[1] = list.indexOf(target - nums[i]);
                    break;
                }
            }
        }
        return solution;
    }

}
