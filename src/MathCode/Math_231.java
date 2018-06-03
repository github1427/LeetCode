package MathCode;

/**
 * 2的幂
 * 给定一个整数，写一个函数来判断它是否是 2 的幂次方。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: 16
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: 218
 * 输出: false
 */
public class Math_231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(536870912));
        System.out.println(Math.log(536870912)/Math.log(2));
        System.out.println(Math.floor(13.32));
        System.out.println();

    }
    public static boolean isPowerOfTwo(int n) {
        return n >= 1 && Math.log(n) / Math.log(2) - (int) (Math.log(n) / Math.log(2)) < Math.pow(10, -10);
    }
}
