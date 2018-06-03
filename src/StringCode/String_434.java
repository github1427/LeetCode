package StringCode;

/**
 * 字符串中的单词数
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * <p>
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * <p>
 * 示例:
 * <p>
 * 输入: "Hello, my name is John"
 * 输出: 5
 */
public class String_434 {
    public static void main(String[] args) {
        String s=", , , ,        a, eaefa";
        String s1="     ";
        System.out.println(countSegments(s));
    }
    public static int countSegments(String s){
//        int count=0;
//        int len=s.length();
//        s=s.toLowerCase();
//        s=s.trim();
//        for (int i=0;i<len;i++){
//            if (s.charAt(i)<'a'||s.charAt(i)>'z'){
//                if (s.charAt(i+1)==' ')
//            }
//        }
        s=s.trim();
        if (s.length()==0){
            return 0;
        }
        String[] strings=s.split(" ");
        int count=strings.length;
        for (String s1:strings){
            if (s1.isEmpty()){
                count--;
            }
        }
        return count;
    }
}
