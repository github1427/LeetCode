package MathCode;

/**
 * 平方数之和
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 * <p>
 * 示例1:
 * <p>
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 * <p>
 * <p>
 * 示例2:
 * <p>
 * 输入: 3
 * 输出: False
 */
public class Math_633 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }

    public static boolean judgeSquareSum(int c) {
        int left = 0, right = (int) Math.sqrt(c);
        int sum = 0;
        while (left <= right) {
            sum = left * left + right * right;
            if (sum > c) {
                right--;
            } else if (sum < c) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }
}
