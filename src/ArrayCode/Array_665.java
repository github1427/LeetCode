package ArrayCode;

/**
 * 非递减序列
 * 给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 * <p>
 * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [4,2,3]
 * 输出: True
 * 解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
 * 示例 2:
 * <p>
 * 输入: [4,2,1]
 * 输出: False
 * 解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
 */
public class Array_665 {
    public static void main(String[] args) {
        int [] nums={4,2,5,4};
        System.out.println(checkPossibility(nums));
    }
    //大神1的解决方案
    public static boolean checkPossibility(int[]nums){
        int len=nums.length;
        if (len==1||len==2){
            return true;
        }
        boolean flag=false;
        for (int i=1;i<len;i++){
            if (nums[i]<nums[i-1]){
                nums[i-1]=nums[i];
                if (flag){
                    return false;
                }else {
                    if (i-2>=0&&nums[i]<nums[i-2]){
                        nums[i]=nums[i-1];
                    }
                    flag=true;
                }
            }
        }
        return true;
    }

    //大神2的解决方案
    public static boolean checkPossibility2(int [] nums){
        int len=nums.length;
        int left=nums[0],right=nums[len-1];
        int count1=0,count2=0;
        for (int i=1;i<len;i++){
            if (nums[i]>=left){
                left=nums[i];
            }else {
                count1++;
            }
            if (nums[len-1-i]<=right){
                right=nums[len-1-i];
            }else {
                count2++;
            }
        }
        return count1<=1 || count2<=1;
    }
}
