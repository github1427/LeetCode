package MathCode;

/**
 * 3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 27
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: 0
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: 9
 * 输出: true
 * 示例 4:
 * <p>
 * 输入: 45
 * 输出: false
 */
public class Math_326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(729));
        System.out.println(Math.log(10)/Math.log(3));
    }
    public static boolean isPowerOfThree(int n){
        while (n>=3){
            if (n%10==1||n%10==3||n%10==7||n%10==9){
                if (n%3==0){
                    n/=3;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
        return n == 1;
    }
}
