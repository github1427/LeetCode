package StringCode;

/**
 * 反转字符串中的单词III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

 示例 1:

 输入: "Let's take LeetCode contest"
 输出: "s'teL ekat edoCteeL tsetnoc"
 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 */
public class String_557 {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        if (s.length()==0){
            return s;
        }
        StringBuilder stringBuilder =new StringBuilder();
        String [] strings=s.split(" ");
        for (int i=0;i<strings.length;i++) {
            stringBuilder.append(reverseWord(strings[i]));
            if (i<strings.length-1){
                stringBuilder.append(" ");
            }

        }
        return stringBuilder.toString();
    }

    private static String reverseWord(String string) {
        char[] chars=string.toCharArray();
        int i=0,j=chars.length-1;
        char c;
        while (i<j){
            c=chars[i];
            chars[i]=chars[j];
            chars[j]=c;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }


}
