package ArrayCode;

/**
 * 旋转数组
 * 将包含 n 个元素的数组向右旋转 k 步。
 * <p>
 * 例如，如果  n = 7 ,  k = 3，给定数组  [1,2,3,4,5,6,7]  ，向右旋转后的结果为 [5,6,7,1,2,3,4]。
 * <p>
 * 注意:
 * <p>
 * 尽可能找到更多的解决方案，这里最少有三种不同的方法解决这个问题。
 * <p>
 * [显示提示]
 * <p>
 * 提示:
 * <p>
 * 要求空间复杂度为 O(1)
 */
public class Array_189 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rotate(nums,3);
        for (int num:nums){
            System.out.print(num+" ");
        }

    }

    public static void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
