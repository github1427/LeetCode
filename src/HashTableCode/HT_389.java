package HashTableCode;

/**
 * 找不同
 * Given two strings s and t which consist of only lowercase letters.
 * <p>
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * <p>
 * Find the letter that was added in t.
 * <p>
 * Example:
 * <p>
 * Input:
 * s = "abcd"
 * t = "abcde"
 * <p>
 * Output:
 * e
 * <p>
 * Explanation:
 * 'e' is the letter that was added.
 */
public class HT_389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcd"));
    }

    public static char findTheDifference(String s, String t) {
        int[] countS = new int[26];
        int[] countT = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countS[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            countT[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (countS[i] != countT[i]) {
                return (char) (i + 'a');
            }
        }
        return '\\';
    }
}
