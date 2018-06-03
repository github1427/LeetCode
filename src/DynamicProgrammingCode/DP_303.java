package DynamicProgrammingCode;

/**
 * 区域和检索-不可变
 * 给定一个数组，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 * <p>
 * 例如：
 * <p>
 * 给定nums = [-2, 0, 3, -5, 2, -1]，求和函数为sumRange()
 * <p>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 */
public class DP_303 {
    public static void main(String[] args) {
        int []nums={-2, 0, 3, -5, 2, -1};
        DP_303 dp303=new DP_303(nums);
        int param= dp303.sumRange(2,5);
        System.out.println(param);
    }
    private int [] sum;
    public DP_303(int [] nums){
        int len=nums.length;
        if (len!=0){
            sum=new int[len];
            sum[0]=nums[0];
            for (int i=1;i<len;i++){
                sum[i]=nums[i]+sum[i-1];
            }
        }
    }
    public int sumRange(int i,int j){
        if (i==0){
            return sum[j];
        }else
            return sum[j]-sum[i-1];
    }
}
