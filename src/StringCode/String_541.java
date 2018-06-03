package StringCode;

/**
 * 反转字符串
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 * <p>
 * 示例:
 * <p>
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 * 要求:
 * <p>
 * 该字符串只包含小写的英文字母。
 * 给定字符串的长度和 k 在[1, 10000]范围内。
 */
public class String_541 {
    public static void main(String[] args) {
        String s="abcdefg";
        System.out.println(reverseStr(s,3));
    }
    public static String reverseStr(String s,int k){
        char[] chars=s.toCharArray();
        int len=chars.length;
        int count=len/(2*k);
        int remain=len%(2*k);
        for (int i=0;i<count;i++){
            reverse(chars,i*2*k,k);
        }
        if (remain>=k){
            reverse(chars,count*2*k,k);
        }else {
            reverse(chars,count*2*k,remain);
        }
        return String.valueOf(chars);
    }
    private static void reverse(char[] chars,int start,int k){
        int end=start+k-1;
        char c;
        while (start<end){
            c=chars[start];
            chars[start]=chars[end];
            chars[end]=c;
            start++;
            end--;
        }
    }
}
