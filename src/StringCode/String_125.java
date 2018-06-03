package StringCode;

/**
 * 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 */
public class String_125 {
    public static void main(String[] args) {
        String s="race a car";
        System.out.println(isPalindrom(s));

    }
    public static boolean isPalindrom(String s){
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while (i<j){
            if (((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9'))&&s.charAt(i)!=' '){
                if (((s.charAt(j)>='a'&&s.charAt(j)<='z')||(s.charAt(j)>='0'&&s.charAt(j)<='9'))&&s.charAt(j)!=' '){
                    if (s.charAt(i++)!=s.charAt(j--)){
                        return false;
                    }
                    continue;
                }
                j--;
                continue;
            }
            i++;
        }
        return true;
    }
}
