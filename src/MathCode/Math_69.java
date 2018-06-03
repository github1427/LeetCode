package MathCode;

/**
 * x的平方根
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 */
public class Math_69 {
    public static void main(String[] args) {
        System.out.println(mySqrt1(2147483647));

    }
    public static int mySqrt(int x){
        int num=0;
        for (int i=1;i<=x;i++){
            if (i*i==x){
                num=i;
                break;
            }else {
                if (i*i>x||i*i<0){
                    num=i-1;
                    break;
                }
            }
        }
        return num;
    }

    public static int mySqrt1(int x){
        //牛顿迭代法
        long result = x;
        while (result * result > x) {
            result = (result + x / result) / 2;
        }

        return (int) result;
    }
}
