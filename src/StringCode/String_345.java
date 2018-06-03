package StringCode;

/**
 * 反转字符串中的元音字母
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1：
 * 给定 s = "hello", 返回 "holle".
 * <p>
 * 示例 2：
 * 给定 s = "leetcode", 返回 "leotcede".
 */
public class String_345 {
    public static void main(String[] args) {
        String s="aA";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s){
        char[]chars=s.toCharArray();
        int i=0,j=s.length()-1;
        while (i<j){
            if (chars[i]=='a'||chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u'
                    ||chars[i]=='A'||chars[i]=='E'||chars[i]=='I'||chars[i]=='O'||chars[i]=='U'){
                if (chars[j]=='a'||chars[j]=='e'||chars[j]=='i'||chars[j]=='o'||chars[j]=='u'
                        ||chars[j]=='A'||chars[j]=='E'||chars[j]=='I'||chars[j]=='O'||chars[j]=='U'){
                    char temp=chars[i];
                    chars[i]=chars[j];
                    chars[j]=temp;
                    i++;
                    j--;
                }else {
                    j--;
                }
            }else {
                i++;
            }
        }
        return String.valueOf(chars);
    }
}
