package ArrayCode;

/**
 * 至少是其他数字两倍的最大数
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 * <p>
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * <p>
 * 如果是，则返回最大元素的索引，否则返回-1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [3, 6, 1, 0]
 * 输出: 1
 * 解释: 6是最大的整数, 对于数组中的其他整数,
 * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [1, 2, 3, 4]
 * 输出: -1
 * 解释: 4没有超过3的两倍大, 所以我们返回 -1.
 */
public class Array_747 {
    public static void main(String[] args) {
        int [] nums={0,0,2,3};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int max1=0,max2=0;
        int len=nums.length;
        int index=0;
        for (int i=0;i<len;i++){
            if (nums[i]>max1) {
                max2=max1;
                max1 = nums[i];
                index = i;
            }else if (nums[i]>max2){
                max2=nums[i];
            }
        }
        if (max1>=2*max2){
            return index;
        }else {
            return -1;
        }
    }
}
