package ArrayCode;

/**
 * 寻找数组的中心索引
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
 * <p>
 * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * <p>
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * nums = [1, 7, 3, 6, 5, 6]
 * 输出: 3
 * 解释:
 * 索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。
 * 同时, 3 也是第一个符合要求的中心索引。
 * 示例 2:
 * <p>
 * 输入:
 * nums = [1, 2, 3]
 * 输出: -1
 * 解释:
 * 数组中不存在满足此条件的中心索引。
 */
public class Array_724 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex2(nums));
    }


    //渣渣代码，最笨最暴力
    public static int pivotIndex(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = 0;
        int pivotIndex = -1;
        for (int i = 0; i < len; i++) {
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    left += nums[j];
                }
            }
            if (i < len - 1) {
                for (int m = i + 1; m < len; m++) {
                    right += nums[m];
                }
            }
            if (left == right) {
                pivotIndex = i;
                break;
            }
            left = 0;
            right = 0;
        }
        return pivotIndex;
    }

    //大神代码，如此优雅
    public static int pivotIndex2(int[] nums) {
        int len=nums.length;
        int leftSum=0,sum=0;
        int pivotIndex=-1;
        for (int num:nums){
            sum+=num;
        }
        for (int i=0;i<len;i++){
            if (leftSum==sum-leftSum-nums[i]){
                pivotIndex=i;
                break;
            }
            leftSum+=nums[i];
        }
        return pivotIndex;
    }
}
