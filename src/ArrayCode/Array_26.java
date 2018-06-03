package ArrayCode;

/**
 * 删除排序数组中的重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * <p>
 * 给定数组 nums = [1,1,2],
 * <p>
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * <p>
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 */
//我的思路：首先设置一个变量count用于保存不重复元素的个数，然后在遍历数组的过程中，将遍历到的元素与下一个元素进行比较，如果相等，继续遍历，如果不等
// ，则将这个元素和下一个元素以count作为索引赋值。因为count代表不重复元素个数，最后return count+1

public class Array_26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
            ;
        }
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
            nums[count] = nums[i + 1];
        }
        return count + 1;
    }
}
