package HashTableCode;

/**
 * 最长回文串
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * <p>
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * <p>
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * "abccccdd"
 * <p>
 * 输出:
 * 7
 * <p>
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 */
public class HT_409 {
    public static void main(String[] args) {
        System.out.println(longestPalndrome("abccccdd"));
    }

    public static int longestPalndrome(String s) {
        int len = 0;
        int[] count = new int[58];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        for (int aCount : count) {
            len += aCount / 2 * 2;
        }
        if (len < s.length()) {
            len++;
        }
        return len;
    }
}
