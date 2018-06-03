package StringCode;

/**
 * 验证回文字符串II
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 */
public class String_680 {
    public static void main(String[] args) {
        String s="aba";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s){
        int i=0,j=s.length()-1;
        int start=0,end=s.length()-1;
        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else {
                break;
            }
        }
        start=i;
        end=j;
        return judge(start + 1, end, s) || judge(start, end - 1, s);
    }

    private static boolean judge(int start,int end,String s){
        while (start<end){
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
