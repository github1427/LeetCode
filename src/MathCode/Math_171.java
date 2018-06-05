package MathCode;

/**
 * EXCEL表列序号
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * <p>
 * 例如，
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 示例 1:
 * <p>
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 * <p>
 * 输入: "ZY"
 * 输出: 701
 */
public class Math_171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AAA"));
    }

    public static int titleToNumber(String s) {
        int number = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            number = (int) (number + (s.charAt(i) - 'A' + 1) * Math.pow(26, len - 1 - i));
        }
        return number;
    }
}
