package MathCode;

/**
 * excel表列名称
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * <p>
 * 例如，
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 * <p>
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 * <p>
 * 输入: 701
 * 输出: "ZY"
 */
public class Math_168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }

    public static String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            n--;
            stringBuilder.append((char) (n % 26 + 'A'));
            n /= 26;
        }
        return stringBuilder.reverse().toString();
    }
}
