package MathCode;

/**
 * 字符串相加
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * <p>
 * 注意：
 * <p>
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 */
public class Math_415 {
    public static void main(String[] args) {
        System.out.println(addStrings("3876620623801494171", "6529364523802684779"));
        System.out.println();
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder s1 = new StringBuilder(num1).reverse();
        StringBuilder s2 = new StringBuilder(num2).reverse();
        if (num1.length() > num2.length()) {
            for (int i = 0; i < num1.length() - num2.length(); i++) {
                s2.append('0');
            }
        } else {
            for (int i = 0; i < num2.length() - num1.length(); i++) {
                s1.append('0');
            }
        }
        StringBuilder sum = new StringBuilder();
        int len = s1.length();
        int overFlow = 0, m = 0;
        for (int i = 0; i < len; i++) {
            m = (s1.charAt(i) - '0') + (s2.charAt(i) - '0') + overFlow;
            if (m >= 10) {
                overFlow = 1;
                m = m - 10;
            } else {
                overFlow = 0;
            }
            sum.append(m);
        }
        if (overFlow == 1) {
            sum.append('1');
        }
        return sum.reverse().toString();
    }
}
